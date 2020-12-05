import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { HotelService } from 'src/app/services/hotel.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {

  hotelToBeBooked;
  email = new FormControl('', [Validators.required, Validators.email]);

  getErrorMessage() {
    if (this.email.hasError('required')) {
      return 'You must enter a value';
    }

    return this.email.hasError('email') ? 'Not a valid email' : '';
  }

  customerName;
  customerEmail;
  customerContact;
  constructor( private hotelService:HotelService) { }

  ngOnInit(): void {
    this.hotelToBeBooked = this.hotelService.selectedHotel;
    console.log('Hotel to be Booked', this.hotelToBeBooked);
  }

  onBookHotel()
{
  console.log('Book Hotel Click');
  const body = {
    "hotelId": this.hotelToBeBooked.hotelId,
    "hotelName": this.hotelToBeBooked.hotelName,
    "hotelPlace": this.hotelToBeBooked.hotelPlace,
    "hotelPrice": this.hotelToBeBooked.hotelPrice,
    "hotelAddress": this.hotelToBeBooked.hotelAddress,
    "cusomerName": this.customerName,
    "customerContact": this.customerContact,
    "customerEmail": this.customerEmail,
    "roomsBooked": 3,
    "daysBooked": 2,
    "bookingDate": "2020-02-29"
}
  this.hotelService.addBooking(body).subscribe(response => {
    console.log('responce is ', response);
    alert(response);
  })

}

}
