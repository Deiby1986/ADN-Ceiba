import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { SalesFormComponent } from './sales-form.component';




const routes: Routes = [
    { path: "", component: SalesFormComponent},

];

@NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forChild(routes)]
})
export class SalesFormRoutingModule { }