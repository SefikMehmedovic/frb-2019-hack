import { Component, Output, EventEmitter, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  @Input() myEvent = new EventEmitter();
  title = 'hack-ui-app';

  public showSignUp = true;
  showConfirmation = false;
  player = null;

  toggleShowSignUp() {
    this.showSignUp = false;
    // this.showConfirmation = true;
    this.myEvent.emit(this.toggleShowSignUp);
    alert('toggleShowSignUp');
  }

}
