package com.bjs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.model.Bookings;
import com.bjs.repository.BookingRepository;

@RestController
@RequestMapping(path="/booking")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {
	
	@Autowired
	BookingRepository bookingRepository;
	
	@GetMapping(path="/getBookings")
	public List<Bookings> getBookings(@RequestParam(required=true) String customerContact)
	{
		try {
			return bookingRepository.findByCustomerContact(customerContact);
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping(path="/addBooking")
	public String addBooking(@RequestBody Bookings booking)
	{
		try {
			bookingRepository.save(booking);
			return "successfully added booking";

		} catch (Exception e) {
			return "Adding Bookings Failed";
			
		}
	}
	

}
