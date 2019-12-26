import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

import { ProductsService } from '../shared/products.service';
import {Product} from '../shared/product.model'
import { TrmService } from '../../share/trm.service';



@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsListComponent implements OnInit {
  products : Observable<Product[]>;
  productsList : Product[];
  trm:Observable<string>;
  constructor( 
    private router: Router,
    private prService:ProductsService,
    private trmService:TrmService) { }

  ngOnInit() {
    this.products = this.prService.getProducts();
    this.products.subscribe(data=>{
      this.productsList = data as Product[];      
    })
    this.prService.seCurrentProduct(null);   
  }

  addProduct(){
    this.router.navigate(['/product']);
  }

  editProduct(i:number){
      this.prService.seCurrentProduct(this.productsList[i]);
  }

}
