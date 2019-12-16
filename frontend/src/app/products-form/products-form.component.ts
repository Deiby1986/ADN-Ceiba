import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Product } from '../models/product';
import { ProductsServiceService } from '../services/products/products-service.service';
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
    private libroService: ProductsServiceService,
    private router: Router) { }

  ngOnInit() {
    this.addProductForm = this.formBuilder.group({
      id:['',''],
      codigo:['',Validators.required],
      nombre:['',Validators.required],
      precio:['',Validators.required],
      cantidad:['',Validators.required],
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
    this.libroService.addProduct(this.product).subscribe( data => {
      console.log(data);
      this.gotoProducts();
      
    });
    console.log("Producto agregado");
  }

  gotoProducts(){
    this.router.navigate(['/products']);
  }

}
