import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestService } from '../rest.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  profile:any;

  constructor(
    public rest: RestService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.getProfile();
  }

  getProfile(): void {
    this.rest.getProfile().subscribe((resp: any) => {
      this.profile = resp;
      console.log(this.profile);
    });
  }

}
