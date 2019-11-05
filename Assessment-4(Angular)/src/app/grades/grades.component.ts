import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-grades',
  templateUrl: './grades.component.html',
  styleUrls: ['./grades.component.css']
})
export class GradesComponent implements OnInit {

  @Input("marks")mark:number;
  constructor() { }

  ngOnInit() {
  }

}
