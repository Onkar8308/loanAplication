import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateloanComponent } from './createloan/createloan.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { PaymentsheduleComponent } from './paymentshedule/paymentshedule.component';
import { ShowLoanComponent } from './show-loan/show-loan.component';

const routes: Routes = [
  {
    path:'',component:DashbordComponent
  },
  {
    path:'createloan',component:CreateloanComponent
  },
  {
    path:'showallloan',component:ShowLoanComponent
  },
  {
    path:'paymentShedule/:loanID',component:PaymentsheduleComponent
  },
  {
    path:'paymentShedule',component:PaymentsheduleComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
