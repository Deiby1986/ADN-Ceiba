import { Component, OnInit } from '@angular/core';
import { TrmService } from './services/trm/trm.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'salesfront';
  trm:string;

  constructor( 
    
    private trmService:TrmService) { }

  ngOnInit() {
    this.trm = this.trmService.getTrm(); 
  }
}
