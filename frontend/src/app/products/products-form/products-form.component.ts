import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Product } from '../shared/product.model';
import { ProductsService } from '../../core/products.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-products-form',
  templateUrl: './products-form.component.html',
  styleUrls: ['./products-form.component.css']
})
export class ProductsFormComponent implements OnInit {

  product: Product;
  addProductForm: FormGroup;

  constructor( private formBuilder: FormBuilder,
    private productService: ProductsService,
    private router: Router) { }

  ngOnInit() {
    this.product = this.productService.getCurrentProduct();
    if(this.product == undefined || this.product.id == undefined)
      this.product = {id:0,nombre:'',codigo:'',price:0,qty:0};
    
    this.addProductForm = this.formBuilder.group({
      id:[this.product.id,''],
      codigo:[this.product.codigo,Validators.required],
      nombre:[this.product.nombre,Validators.required],
      precio:[this.product.price==0?'':this.product.price,Validators.required],
      cantidad:[this.product.qty==0?'':this.product.qty,Validators.required],
    })
  }

  get AddProductoFormCtrl(){
    return this.addProductForm.controls;
  }

  onSubmit(){
    if (this.addProductForm.invalid) {
      return;
    }
    console.log("Agregando producto");

    this.product = {
        id:this.AddProductoFormCtrl.id.value,
        codigo:this.AddProductoFormCtrl.codigo.value,	
        nombre:this.AddProductoFormCtrl.nombre.value,
        price:this.AddProductoFormCtrl.precio.value,
        qty:this.AddProductoFormCtrl.cantidad.value,
    }
    console.log(this.product);
    this.productService.addProduct(this.product).subscribe( data => {
      console.log(data);
      this.gotoProducts();
      
    });
    console.log("Producto agregado");
  }

  gotoProducts(){
    this.router.navigate(['/products']);
  }

}
