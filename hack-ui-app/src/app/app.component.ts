import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'hack-ui-app';
  showSignUp = true;
  showConfirmation = false;
  player = null;
}
