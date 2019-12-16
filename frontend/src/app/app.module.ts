import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { SalesComponent } from './sales/sales.component';
import {ProductsServiceService} from './services/products/products-service.service';
import {HttpClientModule} from '@angular/common/http'
import { TrmService } from './services/trm/trm.service';
import { ProductsFormComponent } from './products-form/products-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    SalesComponent,
    ProductsFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  
  providers: [ProductsServiceService],
  bootstrap: [AppComponent]

})
export class AppModule {

  

 }
