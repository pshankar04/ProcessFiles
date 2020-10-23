package com.test.challenge;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import org.junit.jupiter.api.Test;

class CommaContentTest {

	@Test
	void handleContentTest() throws ParseException {

		CommaContent cc = new CommaContent();
		String record = "Abercrombie, Neil, Male, Tan, 2/13/1943";
		
		int count = 0;

		if(Constants.COMMA_PATTERN.matcher(record).matches()) {
			
			Person person = cc.handleContent(record);
			String recordArray[] = record.split(Constants.COMMA_DELIMITER);
			
			if((recordArray[0].trim()).equals(person.getLastName())) {
				count += 1;
			}
			if((recordArray[1].trim()).equals(person.getFirstName())) {
				count += 1;
			}

			if(cc.getGenderString(recordArray[2].trim()).equals(person.getGender())) {
				count += 1;
			}
			if((recordArray[3].trim()).equals(person.getFavoriteColor())) {
				count += 1;
			}
			if(cc.manipulateDate(recordArray[4].trim()).equals(person.getDateOfbirth())) {
				count += 1;
			}
			
			assertEquals(count,recordArray.length);
		}else {
			fail("Record does not match!");
		}

	}

}
