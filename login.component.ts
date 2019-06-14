import { Component } from '@angular/core';

@Component({

    selector: 'login',
    templateUrl: './login.component.html'         
})



export class LoginComponent{
       username : string;
       password:string;
        message:string;


    authenticate(){
       if(this.username=="sujit" && this.password=='123')
       this.message='Valid User';
       else
       this.message = 'Invalid Username/Password';
    }
}