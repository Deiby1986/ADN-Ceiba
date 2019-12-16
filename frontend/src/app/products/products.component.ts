import { Component, OnInit } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

import { ProductsServiceService } from '../services/products/products-service.service';
import {Product} from '../models/product'
import { TrmService } from '../services/trm/trm.service';



@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  products : Observable<Product[]>;
  trm:Observable<string>;
  constructor( private router: Router,private prService:ProductsServiceService,private trmService:TrmService) { }

  ngOnInit() {
    this.products = this.prService.getProducts();
   // this.trm = this.trmService.getTrm(); 
   // this.trm.subscribe(trm=>console.log(trm));    
  }

  addProduct(){
    this.router.navigate(['/product']);
  }

}
