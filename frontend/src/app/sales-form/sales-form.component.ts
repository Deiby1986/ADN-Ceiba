import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, FormArray } from '@angular/forms';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';


@Component({
  selector: 'app-sales-form',
  templateUrl: './sales-form.component.html',
  styleUrls: ['./sales-form.component.css']
})
export class SalesFormComponent implements OnInit {

  orderForm: FormGroup;
  items: FormArray;

  constructor(
      private formBuilder: FormBuilder,
      private datePipe: DatePipe,
      private router: Router) { }

  ngOnInit() {
    this.orderForm = this.formBuilder.group({
      cliente: '',
      fecha: this.datePipe.transform(new Date(),"dd/MM/yyyy"),
      total: '',
      items: this.formBuilder.array([this.createItem()])
    });
  }

  createItem(): FormGroup {
    return this.formBuilder.group({
      producto: '',
      cantidad: '',
      precio: '',
      total:''
    });
  }

  addItem(): void {
    this.items = this.orderForm.get('items') as FormArray;
    this.items.push(this.createItem());
  }

  gotoSales(){
    this.router.navigate(['/sales']);
  }

}
