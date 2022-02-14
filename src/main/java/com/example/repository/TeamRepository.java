package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Team;

@Repository
public class TeamRepository {
	private static final RowMapper<Team> TEAM_ROW_MAPPER = (rs, i) -> {
		Team team = new Team();
		team.setId(rs.getInt("id"));
		team.setLeague_name(rs.getString("league_name"));
		team.setTeam_name(rs.getString("team_name"));
		team.setHeadquarters(rs.getString("headquarters"));
		team.setInauguration(rs.getString("inauguration"));
		team.setHistory(rs.getString("history"));
		
		return team;
	};
	
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public List<Team> findAll(){
		String sql = "select * from teams order by inauguration asc";
		
		List<Team> teamList = template.query(sql, TEAM_ROW_MAPPER);
		return teamList;
	}
	
	public Team load(Integer id) {
		String sql = "select * from teams where id=:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);

		Team team = template.queryForObject(sql, param, TEAM_ROW_MAPPER);
		return team;
	}

}
