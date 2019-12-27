import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { SalesViewComponent } from './sales-view.component';




const routes: Routes = [
    { path: "", component: SalesViewComponent},

];

@NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forChild(routes)]
})
export class SalesFormRoutingModule { }