import { Component, Input, OnInit } from '@angular/core';
import { RestService, Symbols } from '../rest.service';
import { Router } from '@angular/router';
import { createChart } from 'lightweight-charts';

export interface requestHistData {
  instName: string;
  fromDate: string;
  toDate: string;
}

const chart = createChart(document.body, { width: 500, height: 200 });
const lineSeries = chart.addLineSeries();


@Component({
  selector: 'app-charting',
  templateUrl: './charting.component.html',
  styleUrls: ['./charting.component.css']
})
export class ChartingComponent implements OnInit {

  symbols: Symbols[] = [];
  histData: any[];
  histDataFe: any[] = [];
  @Input() req = { instName: '', fromDate: '', toDate: '' };


  constructor(
    public rest: RestService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getSymbols();
  }

  getSymbols(): void {
    this.rest.getSymbols().subscribe((resp: any) => {
      this.symbols = resp;
    });
  }

  getHistData(): void {
    this.rest.getHistData(this.req).subscribe((resp: any) => {
      this.histData = resp;
      this.histDataFe=[];
      for (let entry of this.histData) {
        const fe = { time: '', value: '' };
        fe.time = entry.date.split("T")[0];
        fe.value = entry.price;
        this.histDataFe.push(fe);
      }
        console.log(this.histDataFe);
        lineSeries.setData(this.histDataFe);
      
    });
  }
}
