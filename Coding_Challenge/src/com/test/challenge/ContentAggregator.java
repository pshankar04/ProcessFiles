package com.test.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContentAggregator {

	private List<Person> PERSONS_LIST = new ArrayList<Person>();	

	/**
	 * @return the pERSONS_LIST
	 */
	public List<Person> getPersonsList() {
		return PERSONS_LIST;
	}
	
	/**
	 * saves the Person records on to the list after parsing
	 * 
	 * @param content - type of file content
	 * @param record - person record
	 */
	public void populateList(Content content, String record) {

		Person person = content.handleContent(record);
		PERSONS_LIST.add(person);

	}

	/**
	 * Sorts the Person objects saved in the PERSONS_LIST using customizable 
	 * Collections.Comparator Interface
	 * Finally, prints the file content as per requirement 
	 */ 

	public void sortAndDisplay() {

		int COUNT = 1;
		if(this.PERSONS_LIST.size() > 1) {
			
			while(COUNT < 4) {

				System.out.println( Constants.OUTPUT + COUNT + ":");

				if(COUNT == 1) {			
					Collections.sort(PERSONS_LIST, new GenderAndLastNameComparator());

				}else if(COUNT == 2) {
					Collections.sort(PERSONS_LIST, new BirthAndLastNameComparator());

				}else {
					Collections.sort(PERSONS_LIST, new LastNameComparator());
				}

				for(Person p: PERSONS_LIST) {
					System.out.println(p.getLastName()+" "+
							p.getFirstName()+" "+
							p.getGender()+" "+
							p.getDateOfbirth()+" "+
							p.getFavoriteColor());

				}
				COUNT++;
				System.out.println();
			}
		}
		else {
			for(Person p: PERSONS_LIST) {
				System.out.println(p.getLastName()+" "+
						p.getFirstName()+" "+
						p.getGender()+" "+
						p.getDateOfbirth()+" "+
						p.getFavoriteColor());

			}
		}

	}


	 
}
