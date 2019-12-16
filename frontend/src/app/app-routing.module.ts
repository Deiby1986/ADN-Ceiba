import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import {ProductsComponent} from './products/products.component';
import {SalesComponent} from './sales/sales.component'



const routes: Routes = [
  {path:'sales',component:SalesComponent},
  {path:'products',component:ProductsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
