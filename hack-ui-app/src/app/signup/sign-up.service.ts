import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Player } from '../player';
import { PLAYERS } from '../mock-player';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root',
})
export class SignUpService {

    constructor(private httpClient: HttpClient){
    }
    //TODO: need more logic?

    signUp(){
        return this.httpClient.post('/api/players', null);
    }

    getPlayers(): Observable<Player[]>{
        return of(PLAYERS);
    }
}