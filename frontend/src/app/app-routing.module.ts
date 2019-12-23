import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';





const routes: Routes = [
  {
    path:'sales',
    loadChildren: "./sales/sales.module#SalesModule"
  },
  {
    path:'sale',
    loadChildren: "./sales-form/sales-form.module#SalesFormModule"
  },
 
  {
    path:'products',
    loadChildren: "./products/products.module#ProductsModule"
  },
  {
    path:'product',
    loadChildren: "./products-form/products-form.module#ProductsFormModule"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
