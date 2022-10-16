import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { HttpService } from '../http.service';
import { loanDetails } from '../model/loanDetails';

@Component({
  selector: 'app-createloan',
  templateUrl: './createloan.component.html',
  styleUrls: ['./createloan.component.css']
})
export class CreateloanComponent implements OnInit {

  load:any=<loanDetails>{};
  constructor(private service:HttpService,
    private router:Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    console.log(this.load);
  this.service.addLoan(this.load) 
  .subscribe((response:any)=>{
   
       console.log(response);
      this.router.navigate(['']);
     })
    }

}
