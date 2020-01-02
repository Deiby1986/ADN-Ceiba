import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { SalesFormComponent } from './sales-form.component';
import { SalesFormRoutingModule } from './sales-form-routing.module';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ShareModule } from 'src/app/share/sharemodule';





@NgModule({
  imports: [CommonModule, SalesFormRoutingModule,ReactiveFormsModule,FormsModule,ShareModule],
  declarations: [SalesFormComponent]
})
export class SalesFormModule {}