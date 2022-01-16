package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Student {

	private String country;
	private Map<String, String> countryOptions;
	private String firstName;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> favoriteLanguageOptions;

	private String lastName;

	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("br", "Brazil");
		countryOptions.put("mx", "Mexico");
		countryOptions.put("us", "EUA");
		countryOptions.put("es", "España");
		countryOptions.put("pe", "Peru");

		favoriteLanguageOptions = new LinkedHashMap<>();
		// parameter order: value, display label
		//
		favoriteLanguageOptions.put("PASCAL", "PASCAL");
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#", "C#");
		favoriteLanguageOptions.put("PHP", "PHP");
		favoriteLanguageOptions.put("Ruby", "Ruby");

	}

	public String getCountry() {
		return country;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
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
				+ ", favoriteLanguage=" + favoriteLanguage + ", favoriteLanguageOptions=" + favoriteLanguageOptions
				+ ", lastName=" + lastName + "]";
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

}
