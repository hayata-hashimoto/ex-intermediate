package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

@Service
public class HotelService {

	@Autowired
	private HotelRepository hotelRepositroy;
	
	public List<Hotel> findAll(){
		return hotelRepositroy.findAll();
	}

	public List<Hotel> findByPrice(Integer price) {
		return hotelRepositroy.findByPrice(price);
	}
}
