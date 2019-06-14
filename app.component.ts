import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <!--The content below is only a placeholder and can be replaced.-->
    <div style="text-align:center">
      <h1>
      <p> what man </p>
        Welcome to {{title}}!
      </h1>
     
      <hello></hello>
      <random></random>
      <login></login>
      <calculator></calculator>
      <list-product></list-product>
  `
  
  ,
      styles: []
  
})
export class AppComponent {
  title = 'app1';
}
