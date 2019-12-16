import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrmService {
  urlTrm: string;
  bodyTrm: string;
  response: Observable<string>;

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
    this.response = this.http.post<string>(this.urlTrm, this.bodyTrm);
    console.log(this.response);
    return this.response;

  }
}
