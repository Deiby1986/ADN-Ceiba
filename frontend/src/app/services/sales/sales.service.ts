import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Salesheader } from 'src/app/models/salesheader';
import { environment } from 'src/app/helpers/enviroment';

@Injectable({
  providedIn: 'root'
})
export class SalesService {

  constructor(private http: HttpClient) { }

  getSales():Observable<Salesheader[]>{    
    return this.http.get<any>(environment.endpointBackend + '/api/sales');
  }
}
