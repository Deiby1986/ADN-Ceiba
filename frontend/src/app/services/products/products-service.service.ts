import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Product } from 'src/app/models/product';
import { environment } from 'src/app/helpers/enviroment';
import { map } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ProductsServiceService {

  constructor(private http: HttpClient) {
  }

  getProducts(): Observable<Product[]> {
    //console.log('Conectando a '+environment.endpointBackend+'/api/products');
    return this.http.get<any>(environment.endpointBackend + '/api/products');
  }

  addProduct(product: Product) {
    console.log("Se agregara producto ");
    return this.http.post<any>(environment.endpointBackend + '/api/products', product)
      .pipe(map(res => {
        console.log("Service response : ", res);
        return res;
      }));
  }


}
