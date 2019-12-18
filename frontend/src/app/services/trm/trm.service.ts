import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrmService {
  urlTrm: string;
  bodyTrm: string;
  response: Observable<string>;
  value:string;

  httpOptions = {
    headers: new HttpHeaders({ 
      'Access-Control-Allow-Origin':'*',
      'Authorization':'authkey',
      'userid':'1'
    })
  };

  constructor(private http: HttpClient) {
   
    this.urlTrm = "https://trm-colombia.makaw-dev.now.sh/?date=2019-12-18";
  }
  getTrm() {
    console.log("Se va obetener la trm");
    this.http.get<string>(this.urlTrm).subscribe( data => {
      this.value = data["data"]["value"];
      console.log('Respuesta :'+this.value);            
    });   
    return this.value;

  }
}
