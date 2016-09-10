package com.jag.hotel.controllers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jag.hotel.model.Booking;
import com.jag.hotel.service.BookingService;

@Controller
public class BookingController {

	@Autowired
	BookingService bookingService;

	@RequestMapping("/*.htm")
	public String showHome(Model model) {

		model.addAttribute("name", "Ram");

		return "index";
	}
	
	@RequestMapping("addBooking.htm")
	public String addBooking(){
		return "booking";
	}

	@RequestMapping("doBook.htm")
	public ModelAndView saveBooking(HttpServletRequest iRequest, HttpServletResponse iResponse) {
		System.out.println("in save booking controller");
		String customerName = iRequest.getParameter("customerName");
		String email = iRequest.getParameter("email");
		String phone = iRequest.getParameter("phone");
		String address = iRequest.getParameter("address");
		String room = iRequest.getParameter("room");
		int noOfPersons = Integer.parseInt(iRequest.getParameter("noOfPersons"));
		int noOfRooms = Integer.parseInt(iRequest.getParameter("noOfRooms"));
		String breakFast = iRequest.getParameter("breakfast");
		String checkIn= iRequest.getParameter("checkIn");
		String checkOut = iRequest.getParameter("checkOut");
		
		Booking booking = new Booking(customerName, email, phone, address, room, noOfPersons, noOfRooms, breakFast, checkIn, checkOut);
		
		bookingService.addBooking(booking);
		
		String bookingId = booking.getBookingId();
		System.out.println("booking id is "+bookingId);
		return new ModelAndView("/bookingSuccess", "booking", bookingId);

	}

	@RequestMapping("viewBook.htm")
	public ModelAndView viewBooking() {

		System.out.println("In get bookings controller");
		List<Booking> bookings = new LinkedList<>();
		bookings= bookingService.getAllBookings();
		for(int i=0; i<bookings.size(); i++){
			Booking booking = bookings.get(i);
			System.out.println(booking.getBookingId());
			System.out.println(booking.getAddress());
		}
		
		return new ModelAndView("bookingDetails", "bookings", bookings);
	}
	
	/*public ModelAndView showBookings(){
		
	}*/
	

	
	
}
