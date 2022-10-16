import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-show-loan',
  templateUrl: './show-loan.component.html',
  styleUrls: ['./show-loan.component.css']
})
export class ShowLoanComponent implements OnInit {
  data:any=[];
  constructor(private service:HttpService) { 
    
  this.service.getAllLoan()
  .subscribe((response:any)=>{
    // console.log(response)
     this.data=response;
   });
  }


  ngOnInit(): void {
  }

  printloan(){
  
  }
  
}
