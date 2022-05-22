import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChartingComponent } from './charting/charting.component'


const routes: Routes = [

  {
    path: 'chart',
    component: ChartingComponent,
    data: { title: 'Symbol Chart' }
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
