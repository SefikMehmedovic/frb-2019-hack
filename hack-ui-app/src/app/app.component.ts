
import { Component, Output, EventEmitter, OnInit, Input } from '@angular/core';
import { Player } from './player';
import { PlayerService } from './services/player.service';
import { Observable } from 'rxjs';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @Input() myEvent = new EventEmitter();
  title = 'hack-ui-app';

  // public showSignUp = true;
  // showConfirmation = false;
 // player = null;

  player$: Observable<Player> = null;
  constructor(private playerService: PlayerService ) {
    this.player$ = this.playerService.getPlayer();
  }
  toggleShowSignUp() {
   // this.showSignUp = false;
    // this.showConfirmation = false;
    // this.showConfirmation = true;
    this.myEvent.emit(this.toggleShowSignUp);
   // alert('toggleShowSignUp');
  }
}
