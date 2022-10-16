import { identifierModuleUrl } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-paymentshedule',
  templateUrl: './paymentshedule.component.html',
  styleUrls: ['./paymentshedule.component.css']
})
export class PaymentsheduleComponent implements OnInit {
  paymentshedule:any=[];
  constructor(private service:HttpService,private router:ActivatedRoute){

   }
  ngOnInit(): void {
    this.service.getPaymentShedule()
    .subscribe((response:any)=>{
    this.paymentshedule=response;
     });
  }

}