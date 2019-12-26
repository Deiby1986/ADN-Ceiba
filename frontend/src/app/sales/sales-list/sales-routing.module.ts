import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { SalesListComponent } from './sales.component';




const routes: Routes = [
    { path: "", component: SalesListComponent},

];

@NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forChild(routes)]
})
export class SalesListRoutingModule { }