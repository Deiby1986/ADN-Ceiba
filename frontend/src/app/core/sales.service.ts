import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Salesheader } from 'src/app/sales/shared/salesheader';
import { environment } from 'src/app/helpers/enviroment';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SalesService {
  private currentSale: Salesheader;

  constructor(private http: HttpClient) { }

  getSales():Observable<Salesheader[]>{    
    return this.http.get<any>(environment.endpointBackend + '/api/sales');
  }

  addSale(sale:Salesheader){
    console.log("Se agregara producto ");
    return this.http.post<any>(environment.endpointBackend + '/api/sales', sale)
      .pipe(map(res => {
        console.log("Service response : ", res);
        return res;
      }));
  }

  setCurrentSale(sale:Salesheader){
    this.currentSale = sale;
  }

  getCurrentSale():Salesheader{
    return this.currentSale;
  }
}
