package com.jag.hotel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookingController {

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
}
