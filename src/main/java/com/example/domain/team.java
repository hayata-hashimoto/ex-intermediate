package com.example.domain;

import java.util.Date;

public class team {
	private Integer id;
	private String leagueName;
	private String teamName;
	private String headquarters;
	private Date inauguration;
	private String history;
	
	
	public team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public team(Integer id, String leagueName, String teamName, String headquarters, Date inauguration,
			String history) {
		super();
		this.id = id;
		this.leagueName = leagueName;
		this.teamName = teamName;
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

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public Date getInauguration() {
		return inauguration;
	}

	public void setInauguration(Date inauguration) {
		this.inauguration = inauguration;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}
	
	
}
