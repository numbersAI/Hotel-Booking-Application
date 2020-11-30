package com.bjs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotels implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2919401497515511249L;

	@Id
	@GeneratedValue
	@Column(name="hotel_id")
	private long hotelId;
	
	@Column(name="hotel_name")
	private String hotelName;

	@Column(name="hotel_place")
	private String hotelPlace;
	
	@Column(name="hotel_address")
	private String hotelAddress;
	
	@Column(name="hotel_price")
	private float hotelPrice;
	
	@Column(name="hotel_type")
	private float hotelType;
	
	@Column(name="hotel_contact")
	private String hotelContact;
	
	@Column(name="hotel_rooms")
	private int hotelRooms;
	
	@Column(name="hotel_rating")
	private float hotelRating;
	
	@Column(name="hotel_category")
	private String hotelCategory;
	
	@Column(name="hotel_amenities")
	private String hotelAmenities;
	
	@Column(name="hotel_policies")
	private String hotelPolicies;

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

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public float getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(float hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

	public float getHotelType() {
		return hotelType;
	}

	public void setHotelType(float hotelType) {
		this.hotelType = hotelType;
	}

	public String getHotelContact() {
		return hotelContact;
	}

	public void setHotelContact(String hotelContact) {
		this.hotelContact = hotelContact;
	}

	public int getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(int hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

	public float getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(float hotelRating) {
		this.hotelRating = hotelRating;
	}

	public String getHotelCategory() {
		return hotelCategory;
	}

	public void setHotelCategory(String hotelCategory) {
		this.hotelCategory = hotelCategory;
	}

	public String getHotelAmenities() {
		return hotelAmenities;
	}

	public void setHotelAmenities(String hotelAmenities) {
		this.hotelAmenities = hotelAmenities;
	}

	public String getHotelPolicies() {
		return hotelPolicies;
	}

	public void setHotelPolicies(String hotelPolicies) {
		this.hotelPolicies = hotelPolicies;
	}
	
	

}
