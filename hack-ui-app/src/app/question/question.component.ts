import { Component, OnInit } from '@angular/core';
import { Question } from '../question';
import {GameService} from '../services/game.service';
import { Observable } from 'rxjs';

@Component({
    selector: 'question-page',
    templateUrl: 'question.component.html'
})

export class QuestionComponent implements OnInit {

question$: Observable<Question> = null;

constructor(private gameService: GameService ) {
  //this.question$ = this.gameService.generateQuestion(11);
}



playerNum: String = '';
// questionNum: Number = '';
answer: String = '';

// answer needs to be an question array
ngOnInit() {
// load question and answer data

}
}
