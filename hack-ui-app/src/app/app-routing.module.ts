import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ConfirmationComponent } from './confirmation/confirmation.component';
import { SignUpComponent } from './signup/sign-up.component';

const routes: Routes = [

{
  path: 'confirmation-page', component: ConfirmationComponent
},
{
  path: 'sign-up', component: SignUpComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
