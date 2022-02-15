package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Clothe;
import com.example.service.ClothesService;

@Controller
@RequestMapping("/clothe")
public class ClothesController {

	@Autowired
	private ClothesService clothesService;
	
	@RequestMapping("")
	public String index() {
		return "ex03";
	}
	
	@RequestMapping("/select")
	public String select(Integer gender, String color, Model model) {
		List<Clothe> clotheList = clothesService.findBySelect(gender, color);
		model.addAttribute("clotheList", clotheList);
		
		return "ex03";
	}
}
