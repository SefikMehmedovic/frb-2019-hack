
import { Component, OnInit } from '@angular/core';
import {CommonModule } from '@angular/common';
import { AppComponent } from '../app.component';
import { Player } from '../player';
import { SignUpService } from './sign-up.service';
import { PlayerService } from '../services/player.service';

@Component({
  providers: [AppComponent, CommonModule ],
    selector: 'sign-up',
    templateUrl: 'sign-up.component.html'
})

export class SignUpComponent implements OnInit {


  ngOnInit() {
  }

  //  callMe() {
  //   this.comp.toggleShowSignUp();
  // }

    constructor(private playerService: PlayerService) {

    }

    signUp() {
        this.playerService.signUp();
    }
}
