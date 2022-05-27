import { NgModule, ɵNOT_FOUND_CHECK_ONLY_ELEMENT_INJECTOR } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChartingComponent } from './charting/charting.component'
import { HoldingsComponent } from './holdings/holdings.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { OrdersComponent } from './orders/orders.component';
import { ProfileComponent } from './profile/profile.component';


const routes: Routes = [

  {
    path: 'chart',
    component: ChartingComponent,
    data: { title: 'Symbol Chart' }
  },
  {
    path: '',
    component: NavBarComponent,
    data: { title: 'navbar'}
  },
  {
    path: 'profile',
    component: ProfileComponent,
    data: { title: 'profile'}
  },
  {
    path: 'holdings',
    component: HoldingsComponent,
    data: { title: 'holding'}
  },
  {
    path: 'placeorder',
    component: OrdersComponent,
    data: { title: 'placeorder'}
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
