import { Component } from '@angular/core';
import { Player } from './player';
import { PlayerService } from './services/player.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hack-ui-app';
  showSignUp$: Observable<boolean>;
  showConfirmation = false;
  player$ : Observable<Player> = null;

  constructor(private playerService: PlayerService ){
    this.player$ = this.playerService.getPlayer();
    //this.showSignUp$ = this.player$.
  }

}
