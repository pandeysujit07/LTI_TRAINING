import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from  '@angular/forms';
import { AppComponent } from './app.component';
import { HelloComponent } from 'src/app/hello.component';
import { RandomComponent } from 'src/app/random.component';
import { LoginComponent } from 'src/app/login.component';
import { CalculatorComponent } from 'src/app/calculator.component';
import { ListProductComponent } from 'src/app/list-product.component';

@NgModule({
  declarations: [
    AppComponent, 
    HelloComponent,
    RandomComponent,
    LoginComponent,
    CalculatorComponent,
    ListProductComponent

  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
