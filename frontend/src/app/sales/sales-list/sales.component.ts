import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { SalesService } from '../shared/sales.service';
import { Observable } from 'rxjs';
import { Salesheader } from '../shared/salesheader';

@Component({
  selector: 'app-sales',
  templateUrl: './sales.component.html',
  styleUrls: ['./sales.component.css']
})
export class SalesListComponent implements OnInit {

  sales:Observable<Salesheader[]>;
  salesList:Salesheader[];
  constructor(private router: Router,
    private salesService:SalesService) { 

    }

  ngOnInit() {
    this.sales = this.salesService.getSales();
    this.sales.subscribe(data=>{
      this.salesList = data as Salesheader[];      
    });
    this.salesService.setCurrentSale(null);
  }

  addVenta(){
    console.log("Ir a venta");
    this.router.navigate(['/sale']);
  }

  viewSale(id:number){
   
    this.salesService.setCurrentSale(this.salesList[id]);
    this.router.navigate(['/sale-view']);
  }

}
