package com.jag.hotel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.jag.hotel.database.DatabaseClass;
import com.jag.hotel.model.Booking;

@Component
public class BookingService {
	
	private Map<String, Booking> bookings = DatabaseClass.getBookingList();
	
	public void addBooking(Booking booking){
		
		bookings.put(booking.getBookingId(), booking);
		System.out.println("in add booking service");
		System.out.println(booking.getBookingId());
		System.out.println(booking.getAddress());
	}
	
	public List<Booking> getAllBookings(){
		System.out.println("in get all bookings service class");
		List<Booking> list =new ArrayList<Booking>(bookings.values());
		for(int i=0; i<list.size(); i++){
			Booking booking = list.get(i);
			System.out.println(booking.getBookingId());
			System.out.println(booking.getAddress());
			
		}
		return list;
	}

}
