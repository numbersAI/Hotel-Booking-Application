package com.bjs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bjs.model.Hotels;

@Repository
public interface HotelRepository extends CrudRepository<Hotels, Long>{
	
	@Query("FROM Hotels h where h.hotelPlace = :hotelPlace ")
	List<Hotels> findByHotelPlace(String hotelPlace );

}
