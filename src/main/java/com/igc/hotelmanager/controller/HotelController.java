package com.igc.hotelmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelapi")
public class HotelController {
	
	@GetMapping("/getall")
	public String getAll() {
		return "All Details";
	}
	@GetMapping("/fid") 
	public String getfoodNo() {
		return "this is Food Id";
	}
 	@GetMapping("/name") 
 		public String getName() {
 			return "Food info basis on food Name ";
 		}
 	
	

}
