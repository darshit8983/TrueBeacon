import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from '../rest.service';

export class Order {
  symbol: String;
  price: String;
  qty: number;
  exchange: String;
}

@Component({
  selector: 'app-orders',
  templateUrl: './orders.component.html',
  styleUrls: ['./orders.component.css']
})
export class OrdersComponent implements OnInit {

  newOrder: Order=new Order();
  response: any="";
  constructor(
    public rest: RestService,
    private router: Router
  ) { 
  }

  ngOnInit() {
  }

  placeOrder() {
    console.log(this.newOrder);
    this.rest.placeOrder(this.newOrder).subscribe((resp: any) => {
      this.response = resp;
      console.log(this.response);
    });
  }

}
