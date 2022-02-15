package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.domain.Hotel;
import com.example.service.HotelService;

@Controller
@RequestMapping("/ex02")
public class HotelController {

	@Autowired
 	private HotelService service;
	
 	@RequestMapping("")
 	public String index() {
 		return "ex02";
 	}
 	
 	
 	@RequestMapping("/hotels")
 	public String search(Integer price,Model model) {
 		List<Hotel> hotelList = null;
 		if(price == null) {
 			hotelList = service.findAll();
 	 		
 		}else {
 	 		hotelList = service.findByPrice(price);
 			
 		}
 		model.addAttribute("hotel",hotelList);
 		return "ex02";
 	}
}