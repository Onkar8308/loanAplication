import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { ShowLoanComponent } from './show-loan/show-loan.component';
import { HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import {MatButtonModule} from '@angular/material/button';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatRadioModule} from '@angular/material/radio';
import {MatInputModule} from '@angular/material/input';
import { CreateloanComponent } from './createloan/createloan.component';
import { PaymentsheduleComponent } from './paymentshedule/paymentshedule.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DashbordComponent,
    ShowLoanComponent,
    CreateloanComponent,
    PaymentsheduleComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatFormFieldModule,
    FormsModule,
    MatRadioModule,
    MatInputModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
