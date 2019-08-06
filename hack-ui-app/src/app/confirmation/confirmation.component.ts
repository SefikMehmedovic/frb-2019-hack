import { Component, OnInit } from '@angular/core';
import { Time } from '@angular/common';
@Component({
  selector: 'confirmation-page',
  templateUrl: './confirmation.component.html'
})

export class confirmationComponent implements OnInit {
  player = 1;
  timeRemaining: Time = null;
  // TODO get time remaining
  calculateRemainingGameTime() {
  }
  constructor() { }
  ngOnInit() { }
}
