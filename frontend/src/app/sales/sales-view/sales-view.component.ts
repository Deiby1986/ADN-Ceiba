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
  templateUrl: './sales-view.component.html',
  styleUrls: ['./sales-view.component.css']
})
export class SalesViewComponent implements OnInit {

  orderForm: FormGroup;
  items: FormArray;
  products: Product[];
  sale: Salesheader;
  idSale: number;
  private editSale:boolean
  private sub: any;

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
      cliente: this.sale == null? '':new FormControl({ value: this.sale.nombreCliente, disabled: true }),
      fecha: this.sale == null?this.datePipe.transform(new Date(), "dd/MM/yyyy"):this.sale.fecha,
      total: this.sale == null?'':this.sale.total,
      items: this.formBuilder.array([this.createItem(null)])
    });  
    
    this.prService.getProducts().subscribe((products) => { 
        this.products = products; 
        if(this.sale!=null)
          this.initItems(this.sale.details);
    });
    this.editSale = this.sale != null;
    console.log("Editando venta : "+this.editSale);
  }

  initItems(details:Salesdetail[]){
   // let detail:any;
    this.items = this.orderForm.get('items') as FormArray;    
    this.items.clear();
    details.forEach(detail=>{
      console.log("detail");
      console.log(detail);
      this.items.push(this.createItem(detail));
    }); 

   
    
        
  }

  createItem(item:Salesdetail): FormGroup {
    return this.formBuilder.group({
      producto: item == null?'':new FormControl({ value: item.product, disabled: true }),
      cantidad: item == null?'':new FormControl({ value: item.qtyPurchased, disabled: true }),
      precio: item == null?0:new FormControl({ value: item .price, disabled: true }, Validators.required),
      total: new FormControl({ value:  item == null?null:item.total, disabled: true }, Validators.required)
    });
  }

  

  gotoSales() {
    this.router.navigate(['/sales']);
  }

  



}
