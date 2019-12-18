import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SalesService } from '../services/sales/sales.service';
import { Observable } from 'rxjs';
import { Salesheader } from '../models/salesheader';

@Component({
  selector: 'app-sales',
  templateUrl: './sales.component.html',
  styleUrls: ['./sales.component.css']
})
export class SalesComponent implements OnInit {

  sales:Observable<Salesheader[]>;
  constructor(private router: Router,
    private salesService:SalesService) { 

    }

  ngOnInit() {
    this.sales = this.salesService.getSales();
  }

  addVenta(){
    console.log("Ir a venta");
    this.router.navigate(['/sale']);
  }

}
