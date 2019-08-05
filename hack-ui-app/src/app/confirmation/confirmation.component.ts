import { Component, OnInit } from '@angular/core';
import { Time } from '@angular/common';
@Component({
  selector: 'confirmation-page',
  templateUrl: './confirmation.component.html'
})
// tslint:disable-next-line: class-name
export class confirmationComponent implements OnInit {
  player: number = 1;
  timeRemaining: Time = null;
  // TODO get time remaining
  calculateRemainingGameTime() {
  }
  constructor() { }
  ngOnInit() { }
}
