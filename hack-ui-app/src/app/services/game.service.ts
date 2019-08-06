import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Question } from '../question';
import { HttpClient } from '@angular/common/http';
import { QUESTION } from '../mock-question';


@Injectable({
  providedIn: 'root',
})
export class GameService {

    constructor(private httpClient: HttpClient){
    }

    generateQuestion(gameId) : Observable <Question[]>{
      return this.httpClient.get<Question[]>('/api/games/'+gameId+'/questions');
    }

    getGame(): Observable<Question[]>{
      return of(QUESTION);
    }
}

