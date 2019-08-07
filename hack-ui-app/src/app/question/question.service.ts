import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { SignUpService } from '../signup/sign-up.service';
import { HttpClient } from 'selenium-webdriver/http';

@Injectable({
  providedIn: 'root',
})
export class QuestionService {

  constructor(private signUpService: SignUpService,
              private hhtpClient: HttpClient) { }

    // getQuestions(): Observable<Question[]> {
    //   return of (Question);
    // }



}
