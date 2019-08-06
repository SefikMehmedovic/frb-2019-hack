import { Component, OnInit } from '@angular/core';
import { Time } from '@angular/common';
import { SignUpService } from '../signup/sign-up.service';
@Component({
  selector: 'confirmation-page',
  templateUrl: './confirmation.component.html'
})

export class ConfirmationComponent implements OnInit {
  player = 1;
  timeRemaining: Time = null;

  constructor(private signUpService: SignUpService){

  }
  // TODO get time remaining
  calculateRemainingGameTime() {
  }
  ngOnInit() { }
}
