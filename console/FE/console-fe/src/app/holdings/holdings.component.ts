import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from '../rest.service';

@Component({
  selector: 'app-holdings',
  templateUrl: './holdings.component.html',
  styleUrls: ['./holdings.component.css']
})
export class HoldingsComponent implements OnInit {

  holdings:any[] = [];

  constructor(
    public rest: RestService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getHoldings();
  }

  getHoldings(): void {
    this.rest.getHoldings().subscribe((resp: any) => {
      this.holdings = resp;
      console.log(this.holdings);
    });
  }

}
