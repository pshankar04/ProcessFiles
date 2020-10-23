package com.test.challenge;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import org.junit.jupiter.api.Test;

class PipeContentTest {

	@Test
	void handleContentTest() throws ParseException {

		PipeContent pc = new PipeContent();
		String record = "Smith | Steve | D | M | Red | 3-3-1985";
		
		int count = 0;

		if(Constants.PIPE_PATTERN.matcher(record).matches()) {
			
			Person person = pc.handleContent(record);
			String recordArray[] = record.split(Constants.PIPE_DELIMITER);

			if((recordArray[0].trim()).equals(person.getLastName())) {
				count += 1;
			}
			if((recordArray[1].trim()).equals(person.getFirstName())) {
				count += 1;
			}
			if((recordArray[2].trim()).equals(person.getMiddleInitial())) {
				count += 1;
			}
			if(pc.getGenderString(recordArray[3].trim()).equals(person.getGender())) {
				count += 1;
			}
			if((recordArray[4].trim()).equals(person.getFavoriteColor())) {
				count += 1;
			}
			if(pc.manipulateDate(recordArray[5].trim()).equals(person.getDateOfbirth())) {
				count += 1;
			}

			assertEquals(count,recordArray.length);
		}else {
			fail("Record does not match!");
		}

	}

}
