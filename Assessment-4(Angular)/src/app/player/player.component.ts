import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Player } from '../Player.model';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {

  // playerObj=new Player();
  @Input("player") player:Player;


  constructor() {

   }

  ngOnInit() {
    // this.playerObj.playerName=this.player.playerName;
    // this.playerObj.club=this.player.club;
    // this.playerObj.position=this.player.position;
    // this.playerObj.jerseyno=this.player.jerseyno;
  }

}
