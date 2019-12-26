import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { SalesListRoutingModule } from './sales-routing.module';
import { SalesListComponent } from './sales.component';




@NgModule({
  imports: [CommonModule, SalesListRoutingModule],
  declarations: [SalesListComponent]
})
export class SalesListModule {}