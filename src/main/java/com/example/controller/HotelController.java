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
 		if(price == null) {
 			List<Hotel> hotelList = service.findAll();
 	 		model.addAttribute("hotel",hotelList);
 		}else {
 	 		List<Hotel> hotel = service.findByPrice(price);
 			model.addAttribute("hotel",hotel);
 		}
 		return "ex02";
 	}
}