package com.igc.hotelmanager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igc.hotelmanager.entity.HotelEntity;

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
 	@GetMapping("/gethotel")
 	public List<HotelEntity> getHotel() {
 		List <HotelEntity> hotelList = new ArrayList();
 		HotelEntity hotelEntity = new HotelEntity();
 		hotelEntity.setId(1);
 		hotelEntity.setName("Nayan");
 		hotelEntity.setEmailid("nayan@gmail.com");

 		HotelEntity hotelEntity2 = new HotelEntity();
 		hotelEntity2.setId(2);
 		hotelEntity2.setName("Gagan");
 		hotelEntity2.setEmailid("gagan@gmail.com");
 		
 		hotelList.add(hotelEntity);
 		hotelList.add(hotelEntity2);
 		return hotelList;
 	}
	

}
