import { Component } from '@angular/core';
import { Player } from './Player.model';
import { Author } from './Author.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  // player = new Player();
  // playerName;
  // club;
  // position;
  // jerseyno;
  // sendPlayer() {
  //   this.player.playerName = this.playerName;
  //   this.player.club = this.club;
  //   this.player.position = this.position.split(",");
  //   this.player.jerseyno = this.jerseyno;
  // }
  //
  // marks;
  // sendMarks;
  // findGrade() {
  //   this.sendMarks = parseInt(this.marks);
  // }


  authors: any[]
  author = new Author();

  constructor() {

    this.authors = this.author.getAuthors();
  }

}
