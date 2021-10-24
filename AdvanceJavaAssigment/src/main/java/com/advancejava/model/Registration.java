package com.advancejava.model;

public class Registration {
		private int partyID;
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String zip;
		private String state;
		private String country;
		private String phone;
		private String userEmail;
		private String password;
				
		public Registration() {}

		public Registration(String firstName, String lastName, String address, String city, String zip, String state,
				String country, String phone, String userEmail, String password) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.zip = zip;
			this.state = state;
			this.country = country;
			this.phone = phone;
			this.userEmail = userEmail;
			this.password = password;
		}

		public int getPartyID() {
			return partyID;
		}

		public void setPartyID(int partyID) {
			this.partyID = partyID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZip() {
			return zip;
		}

		public void setZip(String zip) {
			this.zip = zip;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
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
		
}
