package com.example.domain;

public class Team {
	private Integer id;
	private String league_name;
	private String team_name;
	private String headquarters;
	private String inauguration;
	private String history;
	
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Team(Integer id, String league_name, String team_name, String headquarters, String inauguration,
			String history) {
		super();
		this.id = id;
		this.league_name = league_name;
		this.team_name = team_name;
		this.headquarters = headquarters;
		this.inauguration = inauguration;
		this.history = history;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getLeague_name() {
		return league_name;
	}


	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}


	public String getTeam_name() {
		return team_name;
	}


	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}


	public String getHeadquarters() {
		return headquarters;
	}


	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}


	public String getInauguration() {
		return inauguration;
	}


	public void setInauguration(String inauguration) {
		this.inauguration = inauguration;
	}


	public String getHistory() {
		return history;
	}


	public void setHistory(String history) {
		this.history = history;
	}

	
	
	
}
