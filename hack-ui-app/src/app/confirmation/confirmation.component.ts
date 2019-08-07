import { Component, OnInit } from '@angular/core';
import { Time } from '@angular/common';
import { SignUpService } from '../signup/sign-up.service';
import { PlayerService } from '../services/player.service';
import { Player } from '../player';
import { Observable } from 'rxjs';

@Component({
  selector: 'confirmation-page',
  templateUrl: './confirmation.component.html'
})

export class ConfirmationComponent implements OnInit {

  timeRemaining: Time = null;
  player$: Observable<Player> = null;
  constructor(private playerService: PlayerService ) {
    this.player$ = this.playerService.getPlayer();
  }
  // TODO get time remaining
  calculateRemainingGameTime() {
  }
  ngOnInit() { }
}
