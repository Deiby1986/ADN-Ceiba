import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { SalesComponent } from './sales.component';




const routes: Routes = [
    { path: "", component: SalesComponent},

];

@NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forChild(routes)]
})
export class SalesRoutingModule { }