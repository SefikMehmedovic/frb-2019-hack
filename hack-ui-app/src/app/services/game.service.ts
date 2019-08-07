import { Injectable } from '@angular/core';
import { Observable, of, BehaviorSubject } from 'rxjs';
import { Question } from '../question';
import { HttpClient } from '@angular/common/http';
//import { QUESTION } from '../mock-question';
import { Game } from '../model/game';
import { GAMES } from '../model/mock-game';

@Injectable({
  providedIn: 'root',
})
export class GameService {
  private _game: BehaviorSubject<Game>;
  private _question: BehaviorSubject<Question>;

    constructor(private httpClient: HttpClient) {
     // this._question = <BehaviorSubject<Question>> new BehaviorSubject(null);
    }
    loadGame(gameId: number) {
      this._game.next(GAMES[0]);
    }

    getGame(): Observable<Game> {
      return this._game.asObservable();
    }

    generateQuestion(gameId): Observable <Question[]> {
      return this.httpClient.get<Question[]>('/api/games/' + gameId + '/questions');
    }

    //  getGameQuestions(): Observable<Question[]>{
    //    return of(QUESTION);
    //  }
}

