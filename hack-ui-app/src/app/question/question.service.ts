import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { SignUpService } from '../signup/sign-up.service';

@Injectable({
  providedIn: 'root',
})
export class QuestionService {

  constructor(private signUpService: SignUpService) { }

}