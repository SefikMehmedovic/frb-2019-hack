
import { Component, OnInit } from '@angular/core';
import {CommonModule } from '@angular/common';
import { AppComponent } from '../app.component';

@Component({
  providers: [AppComponent, CommonModule ],
    selector: 'sign-up',
    templateUrl: 'sign-up.component.html'
})



export class SignUpComponent implements OnInit {

  private comp: AppComponent;

  ngOnInit() {
  }

   callMe() {
    this.comp.toggleShowSignUp();
  }

}
