package com.test.challenge;

import java.text.ParseException;

public class SpaceContent extends Content {


	/**
	 * Overrides the handleContent method from the Content abstract class
	 * parses the Person record from a space delimited file
	 * 
	 * @param - line from a space delimited file
	 * @return - Person object
	 */

	public Person handleContent(String record) {
		Person person = null;
		
		try {
			person = new Person();
			String[] personString = record.split(Constants.SPACE_DELIMITER);
			person.setLastName(personString[0].trim());
			person.setFirstName(personString[1].trim());
			person.setMiddleInitial(personString[2].trim());
			person.setGender(getGenderString(personString[3].trim()));
			person.setDateOfbirth(manipulateDate(personString[4].trim()));
			person.setFavoriteColor(personString[5].trim());
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
				

		return person;
	}
}
