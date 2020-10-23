package com.test.challenge;

import java.text.ParseException;

public class CommaContent extends Content {


	/**
	 * Overrides the handleContent method from the Content abstract class
	 * parses the Person record from a comma delimited file
	 * 
	 * @param - line from a comma delimited file
	 * @return - Person object
	 */

	public Person handleContent(String record) {
		Person person = null;
		try {
			person = new Person();
			String[] personString = record.split(Constants.COMMA_DELIMITER);
			person.setLastName(personString[0].trim());
			person.setFirstName(personString[1].trim());
			person.setGender(getGenderString(personString[2].trim()));
			person.setFavoriteColor(personString[3].trim());
			person.setDateOfbirth(manipulateDate(personString[4].trim()));

		} catch (ParseException e) {
			e.printStackTrace();
		}

		return person;
	}
}
