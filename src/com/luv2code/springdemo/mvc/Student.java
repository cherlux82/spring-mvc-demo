package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String country;
	private Map<String, String> countryOptions;
	private String firstName;
	private String favoriteLanguaje;

	public String getFavoriteLanguaje() {
		return favoriteLanguaje;
	}

	public void setFavoriteLanguaje(String favoriteLanguaje) {
		this.favoriteLanguaje = favoriteLanguaje;
	}

	private String lastName;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("br", "Brazil");
		countryOptions.put("mx", "Mexico");
		countryOptions.put("us", "EUA");
		countryOptions.put("es", "España");
		countryOptions.put("pe", "Peru");

	}

	public String getCountry() {
		return country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [country=" + country + ", countryOptions=" + countryOptions + ", firstName=" + firstName
				+ ", favoriteLanguaje=" + favoriteLanguaje + ", lastName=" + lastName + "]";
	}

}
