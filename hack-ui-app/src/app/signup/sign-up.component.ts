
import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { SignUpService } from './sign-up.service';
import { PlayerService } from '../services/player.service';

@Component({
    selector: 'sign-up',
    templateUrl: 'sign-up.component.html'
})

export class SignUpComponent {

   
    constructor(private playerService: PlayerService){

    }

    signUp(){
        this.playerService.signUp();
    }
}