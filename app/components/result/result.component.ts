import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HotelService } from 'src/app/services/hotel.service';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.css']
})
export class ResultComponent implements OnInit {
  displayedColumns: string[] = ['hotelName', 'hotelCategory', 'hotelType', 'hotelRating','hotelAddress','hotelPrice'];

  dataSource;
  constructor(private router:Router, private hotelService:HotelService) { }

  ngOnInit(): void {
    this.dataSource = this.hotelService.searchHotels;
  }

  onHotelClick(row)
  {
    console.log("Hotel Clicked", row);
    this.hotelService.selectedHotel = row;
    this.router.navigateByUrl('/booking');
  }

}
