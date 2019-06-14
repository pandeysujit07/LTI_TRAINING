import { Component } from '@angular/core';

@Component({

    selector: 'random',
    template:  `
            
                <button (click)="generate()"> Click here</button>
                <h2 *ngIf="random"> Random number is:   {{random}} </h2>
    
               
                
    `

})

export class RandomComponent{

//    random:number=Math.ceil(Math.random()*200);
    random: number;

    generate(){
        this.random=Math.ceil(Math.random()*100);
    }

}