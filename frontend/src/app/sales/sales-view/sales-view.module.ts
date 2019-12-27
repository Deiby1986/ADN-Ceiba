import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { SalesViewComponent } from './sales-view.component';
import { SalesFormRoutingModule } from './sales-view-routing.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';





@NgModule({
  imports: [CommonModule, SalesFormRoutingModule,ReactiveFormsModule,FormsModule],
  declarations: [SalesViewComponent]
})
export class SalesViewModule {}