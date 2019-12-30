import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';





const routes: Routes = [
  {
    path:'home',
    loadChildren: "./home/home.module#HomeModule"
  },
  {
    path:'sales',
    loadChildren: "./sales/sales-list/sales.module#SalesListModule"
  },
  {
    path:'sale',
    loadChildren: "./sales/sales-form/sales-form.module#SalesFormModule"
  },

  {
    path:'sale-view',
    loadChildren: "./sales/sales-view/sales-view.module#SalesViewModule"
  },
 
  {
    path:'products',
    loadChildren: "./products/products-list/products.module#ProductsListModule"
  },
  {
    path:'product',
    loadChildren: "./products/products-form/products-form.module#ProductsFormModule"
  },
 /* {
    path: 'notfound', 
    loadChildren: 'app/notfound/notfound.module#NotFoundModule'
  },
  { 
    path: '**', redirectTo: '/notfound' 
  }*/
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
