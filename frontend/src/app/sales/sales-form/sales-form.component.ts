import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormArray, FormControl, Validators } from '@angular/forms';
import { DatePipe } from '@angular/common';
import { Router, ActivatedRoute } from '@angular/router';
import { ProductsService } from '../../products/shared/products.service';
import { Product } from '../../products/shared/product.model';
import { Observable } from 'rxjs';
import { Salesdetail } from '../shared/salesdetail';
import { SalesService } from '../shared/sales.service';
import { Salesheader } from '../shared/salesheader';



@Component({
  selector: 'app-sales-form',
  templateUrl: './sales-form.component.html',
  styleUrls: ['./sales-form.component.css']
})
export class SalesFormComponent implements OnInit {

  private orderForm: FormGroup;
  private items: FormArray;
  private products: Product[];
  private sale: Salesheader;  
  private editSale:boolean
  private error:string;
  

  constructor(
    private formBuilder: FormBuilder,
    private datePipe: DatePipe,
    private router: Router,
    private route: ActivatedRoute,
    private prService: ProductsService,
    private salesService: SalesService) { }

  ngOnInit() {
  
    this.sale = this.salesService.getCurrentSale();
    
    this.orderForm = this.formBuilder.group({
      cliente: this.sale == null? '':new FormControl({ value: this.sale.nombreCliente, disabled: true},Validators.required),
      fecha: this.sale == null?this.datePipe.transform(new Date(), "dd/MM/yyyy"):this.sale.fecha,
      total: this.sale == null?'':this.sale.total,
      items: this.formBuilder.array([this.createItem(null)],[Validators.minLength(2)])
    });  
    
    this.prService.getProducts().subscribe((products) => { 
        this.products = products; 
       
    });  
  }
 

  createItem(item:Salesdetail): FormGroup {
    return this.formBuilder.group({
      producto: item == null?'':new FormControl({ value: item.product, disabled: true }),
      cantidad: [item == null?'1':item.qtyPurchased, [Validators.required,Validators.min(1),Validators.pattern(/\d{1,5}$/)]],
      precio: [item == null?0:item.price, [Validators.required]],
      total: new FormControl({ value:  item == null?null:item.total, disabled: true }, Validators.required)
    });
  }

  calculate() {
    console.log("Calculando...");
    var itemsCl: FormArray;
    itemsCl = this.orderForm.get('items') as FormArray;
    let totalLocal = 0;
    let vacios = 0;
    for (let i = 0; i < itemsCl.length; i++) {
      var pr: Product;
      pr = itemsCl.at(i).get("producto").value;
      if (pr.id == undefined) {
        vacios++;
        continue;
      }
      let cantidad = itemsCl.at(i).get("cantidad").value;
      let subtotal = cantidad * pr.price;
      totalLocal = totalLocal + subtotal;
      itemsCl.at(i).get("precio").setValue(pr.price);
      itemsCl.at(i).get("total").setValue(subtotal);
    }

    this.orderForm.controls['total'].setValue(totalLocal);
    if (vacios == 0)
      this.addItem();
  }

  addItem(): void {
    this.items = this.orderForm.get('items') as FormArray;
    this.items.push(this.createItem(null));
  }

  deleteItem(i: number): void {
    this.items = this.orderForm.get('items') as FormArray;
    if (this.items.length > 1) {
      this.items.removeAt(i);
      this.calculate();
    }

  }


  saveSale() {
    var header: Salesheader;
    header = {
      id: 0,
      nombreCliente: this.orderForm.controls['cliente'].value,
      fecha: this.orderForm.controls['fecha'].value,
      total: this.orderForm.controls['total'].value,
      details: this.getSaleDetails()
    }

    console.log(header);
    this.salesService.addSale(header).subscribe(data => {
      console.log(data);
      this.gotoSales();
    },
    error=>{
      this.error = error.error.message;
    }
    );
  }

  getSaleDetails(): Salesdetail[] {
    var itemsCl: FormArray;
    itemsCl = this.orderForm.get('items') as FormArray;
    var pr: Product;
    let detalles: Salesdetail[];
    detalles = [];
    for (let i = 0; i < itemsCl.length; i++) {
      pr = itemsCl.at(i).get("producto").value;
      if (pr.id == undefined) {
        continue;
      }
      let cantidad = itemsCl.at(i).get("cantidad").value;
      let subtotal = cantidad * pr.price;
      detalles.push({
        id: 0,
        idHeader: 0,
        idProduct: pr.id,
        product:'',
        price:0,
        qtyPurchased: cantidad,
        total: subtotal
      });
    }
    return detalles;

  }

  gotoSales() {
    this.router.navigate(['/sales']);
  }

  cancel() {
    if (window.confirm('¿Esta seguro que desea cancelar la venta?'))
      this.gotoSales();
  }



}
