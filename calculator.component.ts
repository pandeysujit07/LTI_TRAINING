import { Component } from '@angular/core';

@Component({

    selector: 'calculator',
    templateUrl: './calculator.component.html'         
})



export class CalculatorComponent{
       input1 : number;
       input2: number;
       message: number;


       authent(){
       this.message= this.input1+this.input2;
    }
}