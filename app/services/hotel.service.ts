import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HotelService {
  searchHotels;
  selectedHotel;
  constructor(private http:HttpClient) { }

  getHotels(hotelPlace)
  {
    return this.http.get('http://localhost:8080/hotel/getHotels?hotelPlace='+hotelPlace);
  }
  addBooking(body)
  {
    return this.http.post('http://localhost:8080/booking/addBooking', body,{
      responseType:'text'
    });
  }
}
