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

  httpOptions = {
    headers: new HttpHeaders({ 
      'Access-Control-Allow-Origin':'*',
      'Authorization':'authkey',
      'userid':'1'
    })
  };

  constructor(private http: HttpClient) {
   
    this.urlTrm = "https://www.superfinanciera.gov.co/SuperfinancieraWebServiceTRM/TCRMServicesWebService/TCRMServicesWebService";
    this.bodyTrm = "<Envelope xmlns=\"http://schemas.xmlsoap.org/soap/envelope/\">" +
      "<Body>" +
      "<queryTCRM xmlns=\"http://action.trm.services.generic.action.superfinanciera.nexura.sc.com.co/\">"
    "<tcrmQueryAssociatedDate xmlns=\"\">${date}</tcrmQueryAssociatedDate>" +
      "</queryTCRM>" +
      "</Body>" +
      "</Envelope>";

  }
  getTrm() {
    console.log("Se va obetener la trm");
    this.http.post<string>(this.urlTrm, this.bodyTrm,this.httpOptions).subscribe( data => {
      console.log('Respuesta :'+data);      
    });
    console.log(this.response);
    return this.response;

  }
}
