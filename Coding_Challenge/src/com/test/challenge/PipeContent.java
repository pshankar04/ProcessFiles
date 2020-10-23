package com.test.challenge;

import java.text.ParseException;

public class PipeContent extends Content {

	/**
	 * Overrides the handleContent method from the Content abstract class
	 * parses the Person record from a pipe delimited file
	 * 
	 * @param - line from a pipe delimited file
	 * @return - Person object
	 */

	public Person handleContent(String record) {
		
		Person person = null;
		try {
			person = new Person();
			String[] personString = record.split(Constants.PIPE_DELIMITER);
			person.setLastName(personString[0].trim());
			person.setFirstName(personString[1].trim());
			person.setMiddleInitial(personString[2].trim());
			person.setGender(getGenderString(personString[3].trim()));
			person.setFavoriteColor(personString[4].trim());
			person.setDateOfbirth(manipulateDate(personString[5].trim()));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return person;

	}
}
