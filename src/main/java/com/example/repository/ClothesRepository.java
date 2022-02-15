package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Clothe;



@Repository
public class ClothesRepository {
	private static final RowMapper<Clothe> CLOTHE_ROW_MAPPER = (rs, i) -> {
		Clothe clothe = new Clothe();
		clothe.setId(rs.getInt("id"));
		clothe.setCategory(rs.getString("category"));
		clothe.setGenre(rs.getString("genre"));
		clothe.setGender(rs.getInt("gender"));
		clothe.setColor(rs.getString("color"));
		clothe.setPrice(rs.getInt("price"));
		clothe.setSize(rs.getString("size"));
		
		return clothe;
	};
	
	@Autowired 
	NamedParameterJdbcTemplate template;
	
	
	public List<Clothe> findBySelect(Integer gender, String color) {
		String sql = "select * from clothes where gender = :gender and color = :color";
		SqlParameterSource param = new MapSqlParameterSource().addValue("gender",gender).addValue("color", color);
		List<Clothe> clothe = template.query(sql, param, CLOTHE_ROW_MAPPER);
		return clothe;
	}
}
