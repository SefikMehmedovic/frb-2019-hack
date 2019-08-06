
import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { SignUpService } from './sign-up.service';

@Component({
    selector: 'sign-up',
    templateUrl: 'sign-up.component.html'
})
export class SignUpComponent implements OnInit{

    currentPlayer: Player;
    players: Player[];

    constructor(private signUpService: SignUpService){}

    ngOnInit(){
        this.getPlayers();
    }

    getPlayers(): void{
        this.signUpService.getPlayers().subscribe(players => this.players = players); 
    }


}