import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class HttpService {

    
  private baseUrl:string='http://localhost:8080/';

  constructor(private service:HttpClient) { }

  
getAllLoan(){
  return  (this.service.get(`${this.baseUrl}loan`))
 }

 addLoan(obj:any){
  return (this.service.post(`${this.baseUrl}saveloan`,obj,{
     responseType:'text'
   }));
}

getLoanbyId(loanID:any){
  return  (this.service.get(`${this.baseUrl}loan/${loanID}`))

}

getPaymentShedule(){
  return  (this.service.get(`${this.baseUrl}paymentshedule`))
  
}
}
