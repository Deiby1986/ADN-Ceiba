import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { SalesFormComponent } from './sales-form.component';
import { SalesFormRoutingModule } from './sales-form-routing.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';





@NgModule({
  imports: [CommonModule, SalesFormRoutingModule,ReactiveFormsModule,FormsModule],
  declarations: [SalesFormComponent]
})
export class SalesFormModule {}