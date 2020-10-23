package com.test.challenge;

import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;
import org.junit.jupiter.api.Test;

class SpaceContentTest {

	@Test
	void handleContentTest() throws ParseException {

		SpaceContent sc = new SpaceContent();
		String record = "Hingis Martina M F 4-2-1979 Green";

		int count = 0;
		if(Constants.SPACE_PATTERN.matcher(record).matches()) {

			Person person = sc.handleContent(record);
			String recordArray[] = record.split(" ");

			if((recordArray[0].trim()).equals(person.getLastName())) {
				count += 1;
			}
			if((recordArray[1].trim()).equals(person.getFirstName())) {
				count += 1;
			}
			if((recordArray[2].trim()).equals(person.getMiddleInitial())) {
				count += 1;
			}
			if(sc.getGenderString(recordArray[3].trim()).equals(person.getGender())) {
				count += 1;
			}
			if((recordArray[5].trim()).equals(person.getFavoriteColor())) {
				count += 1;
			}
			if(sc.manipulateDate(recordArray[4].trim()).equals(person.getDateOfbirth())) {
				count += 1;
			}

			assertEquals(count,recordArray.length);
		}else {
			fail("Record does not match!");
		}

	}

}
