package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Clothe;
import com.example.repository.ClothesRepository;

@Service
public class ClothesService {
	
	@Autowired
	private ClothesRepository clothesRepository;
	
	public List<Clothe> findBySelect(Integer gender, String color){
		return clothesRepository.findBySelect(gender, color);
	}
}
