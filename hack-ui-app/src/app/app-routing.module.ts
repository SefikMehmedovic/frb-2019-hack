import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ConfirmationComponent } from './confirmation/confirmation.component';

const routes: Routes = [

{
  path: 'confirmation-page', component: ConfirmationComponent
}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
