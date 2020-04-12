package com.microservice.eurekaclient.model;

import org.springframework.stereotype.Component;

@Component
public class Cricket {

	private String team1;
	private String team2;
	private String runsscoredbyteam1;
	private String runsscoredbyteam2;
	private String totalwickets;
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getRunsscoredbyteam1() {
		return runsscoredbyteam1;
	}
	public void setRunsscoredbyteam1(String runsscoredbyteam1) {
		this.runsscoredbyteam1 = runsscoredbyteam1;
	}
	public String getRunsscoredbyteam2() {
		return runsscoredbyteam2;
	}
	public void setRunsscoredbyteam2(String runsscoredbyteam2) {
		this.runsscoredbyteam2 = runsscoredbyteam2;
	}
	public String getTotalwickets() {
		return totalwickets;
	}
	public void setTotalwickets(String totalwickets) {
		this.totalwickets = totalwickets;
	}
	
	
}
