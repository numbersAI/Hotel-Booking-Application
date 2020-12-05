import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from 'src/app/services/hotel.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  hotelPlace;
  roomsBooked;
  date;

  constructor(private router:Router, private hotelService:HotelService) { }


  ngOnInit(): void {
  }
  addEvent(event)
  {
    this.date = event.value;
  }

  onButtonClick() {
    console.log('Search Hotel click');
    console.log(this.hotelPlace);
    console.log(this.roomsBooked);
    console.log(this.date);
    if(this.hotelPlace === '' || this.hotelPlace === undefined)
    {
      return;
    }
    this.hotelService.getHotels(this.hotelPlace).subscribe(response => {
    console.log('Hotels are ', response);
    this.hotelService.searchHotels = response;
      this.router.navigateByUrl('/result');
    });
  }
}
