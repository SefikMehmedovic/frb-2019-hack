import { Observable, of, BehaviorSubject } from 'rxjs';
import { Player } from '../player';
import { PLAYERS } from '../mock-player';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable()
export class PlayerService {
    private _player: BehaviorSubject<Player>;

    constructor(private httpClient: HttpClient) {
        this._player = <BehaviorSubject<Player>> new BehaviorSubject(null);
    }

    signUp() {
        // this.httpClient.post<Player>('/api/players', null).subscribe(
        //     data => {
        //         this._player.next(data);
        //     }
        // );
        this._player.next(PLAYERS[0]);
    }

    nextQuestion()
    {

    }

    getPlayer(): Observable<Player> {
        return this._player.asObservable();
    }

    getPlayers(): Observable<Player[]> {
        return of(PLAYERS);
    }
}
