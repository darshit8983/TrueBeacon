import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChartingComponent } from './charting/charting.component' 
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { HoldingsComponent } from './holdings/holdings.component';
import { ProfileComponent } from './profile/profile.component';
import { OrdersComponent } from './orders/orders.component';

@NgModule({
  declarations: [
    AppComponent,
    ChartingComponent,
    NavBarComponent,
    HoldingsComponent,
    ProfileComponent,
    OrdersComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
