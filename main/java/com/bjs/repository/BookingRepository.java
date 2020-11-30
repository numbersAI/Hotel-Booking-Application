package com.bjs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bjs.model.Bookings;

@Repository
public interface BookingRepository extends CrudRepository<Bookings, Long>
{
	@Query(" FROM Bookings b where b.customerContact = :customerContact")
	List<Bookings> findByCustomerContact(String customerContact);
}
