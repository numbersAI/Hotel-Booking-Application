package com.bjs.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bookings")
public class Bookings implements Serializable{



	/**
	 * 
	 */
	private static final long serialVersionUID = 111166316510985587L;

	@Id
	@GeneratedValue
	@Column(name="booking_id")
	private long bookingID;
	
	@Column(name="hotel_id")
	private long hotelId;//
	
	@Column(name="hotel_name")
	private String hotelName;//
	
	@Column(name="hotel_place")
	private String hotelPlace;//
	
	@Column(name="hotel_price") 
	private float hotelPrice;//
	
	@Column(name="hotel_address")
	private String hotelAddress;//
		
	@Column(name="customer_name")
	private String cusomerName;//
	
	@Column(name="customer_contact")
	private String customerContact;//
	
	@Column(name="customer_email")
	private String customerEmail;//
	
	@Column(name="rooms_booked")
	private int roomsBooked;//
	
	@Column(name="days_booked")
	private int daysBooked;//

	@Column(name="booking_date")
	private Date bookingDate;//

	public long getBookingID() {
		return bookingID;
	}

	public void setBookingID(long bookingID) {
		this.bookingID = bookingID;
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelPlace() {
		return hotelPlace;
	}

	public void setHotelPlace(String hotelPlace) {
		this.hotelPlace = hotelPlace;
	}

	public float getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(float hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public String getCusomerName() {
		return cusomerName;
	}

	public void setCusomerName(String cusomerName) {
		this.cusomerName = cusomerName;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public int getRoomsBooked() {
		return roomsBooked;
	}

	public void setRoomsBooked(int roomsBooked) {
		this.roomsBooked = roomsBooked;
	}

	public int getDaysBooked() {
		return daysBooked;
	}

	public void setDaysBooked(int daysBooked) {
		this.daysBooked = daysBooked;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	
}
