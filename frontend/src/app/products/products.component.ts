import { Component, OnInit } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { Observable } from 'rxjs';

import { ProductsServiceService } from '../services/products/products-service.service';
import {Product} from '../models/product'



@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : Observable<Product[]>;
  //products : Product[];
  constructor(private prService:ProductsServiceService) { }

  ngOnInit() {
    this.products = this.prService.getProducts();
    this.products.forEach(product=>console.log(product));
   
    //this.products = this.prService.getProducts();
  }

}
