import { Component, OnInit } from '@angular/core';
//import {QuestionAnswerService} from '';

@Component({
    selector: 'question',
    templateUrl: 'question.component.html'
})

export class QuestionComponent implements OnInit{

    
playerNum: String = '';
//questionNum: Number = '';
answer: String = '';

//answer needs to be an question array
ngOnInit() {
//load question and answer data

}
}