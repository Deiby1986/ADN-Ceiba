import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ProductsFormComponent } from './products-form.component';




const routes: Routes = [
    { path: "", component: ProductsFormComponent},

];

@NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forChild(routes)]
})
export class ProductsFormRoutingModule { }