package com.test.challenge;

public class Person {
	
	/**
	 * Person Last name
	 */
	private String lastName;
	
	/**
	 * Person first name
	 */
	private String firstName;
	
	/**
	 * Person middle initial
	 */
	private String middleInitial;
	
	/**
	 * Person gender
	 */
	private String gender;
	
	/**
	 * Person favorite color
	 */
	private String favoriteColor;
	
	/**
	 * Person date of birth
	 */
	private String dateOfbirth;

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleInitial
	 */
	public String getMiddleInitial() {
		return middleInitial;
	}

	/**
	 * @param middleInitial the middleInitial to set
	 */
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the favoriteColor
	 */
	public String getFavoriteColor() {
		return favoriteColor;
	}

	/**
	 * @param favoriteColor the favoriteColor to set
	 */
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	/**
	 * @return the dateOfbirth
	 */
	public String getDateOfbirth() {
		return dateOfbirth;
	}

	/**
	 * @param dateOfbirth the dateOfbirth to set
	 */
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", gender=" + gender + ", favoriteColor=" + favoriteColor + ", dateOfbirth=" + dateOfbirth + "]";
	}
	
	
	

}
