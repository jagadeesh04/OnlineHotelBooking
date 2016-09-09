package com.jag.hotel.controllers;

import java.util.ArrayList;
import java.util.List;

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

	
	private BookingService bookingService = new BookingService();
	
	@RequestMapping("/*.htm")
	public String showHome(Model model){
		
	model.addAttribute("name", "Ram");
		
		return "index";
	}
	
	@RequestMapping("doBook.htm")
	public String doBooking(){
		
	//model.addAttribute("name", "Ram");
		
		return "booking";
	}
	
	
	@RequestMapping("viewBook.htm")
	public String showBooking(){
		
	//model.addAttribute("name", "Ram");
		
		return "bookingDetails";
	}
	
	@RequestMapping(value="addBooking.htm", method=RequestMethod.POST)
	public String saveBooking(@ModelAttribute Booking booking){
		System.out.println("in save booking controller");
		List<Booking> list = new ArrayList<>();
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		
		bookingService.addBooking(booking);
		
		return "bookingSuccess";
		
		
		
	}
	
	
}
