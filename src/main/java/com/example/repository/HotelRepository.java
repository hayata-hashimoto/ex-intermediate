package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Hotel;


@Repository
public class HotelRepository {
	
	
	private static final RowMapper<Hotel> HOTELS_ROW_MAPPER=(rs,i)->{
		Hotel hotel =new Hotel();
		hotel.setId(rs.getInt("id"));
		hotel.setArea_name(rs.getString("area_name"));
		hotel.setHotel_name(rs.getString("hotel_name"));
		hotel.setAddress(rs.getString("address"));
		hotel.setNearest_station(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		hotel.setParking(rs.getString("parking"));
		return hotel;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate template;

	public List<Hotel>findAll(){
		String sql = "select * from hotels order by price desc";
		List<Hotel> hotelList= template.query(sql,HOTELS_ROW_MAPPER);
		return hotelList;
	}
	
	
	public List<Hotel> findByPrice(Integer price) {
		String sql = "select * from hotels where price <= :price order by price desc";
		SqlParameterSource param = new MapSqlParameterSource().addValue("price",price);
		List<Hotel> hotel = template.query(sql, param, HOTELS_ROW_MAPPER);
		return hotel;
	}
}