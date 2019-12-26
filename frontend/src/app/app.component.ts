import { Component, OnInit } from '@angular/core';
import { TrmService } from './share/trm.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Ventas';
  trm: string;

  constructor(
    private trmService: TrmService,
    private router: Router
  ) {
    this.trmService.getTrm().subscribe(data => {
      this.trm = data["data"]["value"];
      console.log('Respuesta :' + this.trm);
    });
    this.router.navigate(['/home']);

  }


}
