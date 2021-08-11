package com.advancejava.model;

public class Login{
	private String userEmail;
	private String password;
	private int partyId;
	public Login(String userEmail, String password, int partyId) {
		super();
		this.userEmail = userEmail;
		this.password = password;
		this.partyId = partyId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPartyId() {
		return partyId;
	}
	public void setParty_id(int partyId) {
		this.partyId = partyId;
	}
	
	
}