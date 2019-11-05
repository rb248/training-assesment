import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PlayerComponent } from './player/player.component';
import { GradesComponent } from './grades/grades.component';
import { PipesComponent } from './pipes/pipes.component';
import { GenderPipe } from './gender.pipe';
import { UsermodModule } from './usermod/usermod.module';

@NgModule({
  declarations: [
    AppComponent,
    PlayerComponent,
    GradesComponent,
    PipesComponent,
    GenderPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    UsermodModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
