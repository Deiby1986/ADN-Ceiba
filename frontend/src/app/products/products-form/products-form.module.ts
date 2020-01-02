import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { ProductsFormRoutingModule } from './products-form-rounting.module';
import { ProductsFormComponent } from './products-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { ShareModule } from 'src/app/share/sharemodule';





@NgModule({
  imports: [CommonModule, ProductsFormRoutingModule,ReactiveFormsModule,FormsModule,ShareModule],
  declarations: [ProductsFormComponent]
})
export class ProductsFormModule {}