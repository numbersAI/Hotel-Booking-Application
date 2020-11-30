package com.bjs.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bjs.model.Hotels;
import com.bjs.repository.HotelRepository;

@RestController
@RequestMapping(path="/hotel")
@CrossOrigin(origins = "http://localhost:4200")
public class HotelController {
	
	@Autowired
	HotelRepository hotelRepository;
	
	@GetMapping(path="/getHotels")
	public List<Hotels> getHotels(@RequestParam (required = true) String hotelPlace)
	{
		try {
			return hotelRepository.findByHotelPlace(hotelPlace);
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping(path="/addHotel")
	public String addHotel(@RequestBody Hotels hotel)
	{
		try
		{
			hotelRepository.save(hotel);
			return "Successfully added hotel";
		}
		catch(Exception e)
		{
			return "adding hotel failed";
		}
	}
	
}
