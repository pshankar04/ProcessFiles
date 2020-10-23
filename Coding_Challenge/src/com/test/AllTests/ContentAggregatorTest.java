package com.test.challenge;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class ContentAggregatorTest {


	private static String output_1 = "Hingis Martina Female 4/2/1979 Green Kelly Sue Female 7/12/1959 Pink "+
									 "Kournikova Anna Female 6/3/1975 Red Seles Monica Female 12/2/1973 Black "+
									 "Abercrombie Neil Male 2/13/1943 Tan Bishop Timothy Male 4/23/1967 Yellow "+
									 "Bonk Radek Male 6/3/1975 Green Bouillon Francis Male 6/3/1975 Blue Smith Steve Male 3/3/1985 Red ";
	
	@Test
	void sortAndDisplayTest() {
		String result = "";
		List<String> pList = new ArrayList<String>();
		pList.add("Smith | Steve | D | M | Red | 3-3-1985");
		pList.add("Bonk | Radek | S | M | Green | 6-3-1975");
		pList.add("Bouillon | Francis | G | M | Blue | 6-3-1975");
		pList.add("Kournikova Anna F F 6-3-1975 Red");  
		pList.add("Hingis Martina M F 4-2-1979 Green"); 
		pList.add("Seles Monica H F 12-2-1973 Black");
		pList.add("Abercrombie, Neil, Male, Tan, 2/13/1943");
		pList.add("Bishop, Timothy, Male, Yellow, 4/23/1967");
		pList.add("Kelly, Sue, Female, Pink, 7/12/1959");

		ContentAggregator contentAgg = new ContentAggregator();
		CommaContent cc = new CommaContent();
		PipeContent pc = new PipeContent();
		SpaceContent sc = new SpaceContent();

		for(String record: pList) {

			if(Constants.SPACE_PATTERN.matcher(record).matches()) {
				contentAgg.populateList(sc, record);
			}else if(Constants.PIPE_PATTERN.matcher(record).matches()) {
				contentAgg.populateList(pc, record);
			}else {
				contentAgg.populateList(cc, record);
			}

		}
		int count = 1;

		if(count == 1) {			
			Collections.sort(contentAgg.getPersonsList(), new GenderAndLastNameComparator());

		}else if(count == 2) {
			Collections.sort(contentAgg.getPersonsList(), new BirthAndLastNameComparator());

		}else {
			Collections.sort(contentAgg.getPersonsList(), new LastNameComparator());
		}

		for(Person p: contentAgg.getPersonsList()) {
			result += p.getLastName() + " " +
					p.getFirstName() + " " +
					p.getGender() + " " +
					p.getDateOfbirth() + " " +
					p.getFavoriteColor() + " ";

		}

		assertEquals(result,output_1);

	}

}
