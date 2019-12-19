import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ProductsComponent} from './products/products.component';
import {SalesComponent} from './sales/sales.component'
import {ProductsFormComponent} from './products-form/products-form.component'
import { SalesFormComponent } from './sales-form/sales-form.component';



const routes: Routes = [
  {path:'sales',component:SalesComponent},
  {path:'sale',component:SalesFormComponent},
  {path:'sale/:id',component:SalesFormComponent},
  {path:'products',component:ProductsComponent},
  {path:'product',component:ProductsFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
