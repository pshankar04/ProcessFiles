package com.test.challenge;

import java.util.Comparator;

public class GenderAndLastNameComparator implements Comparator<Person> {
	@Override
	public int compare(final Person p1, final Person p2) {
		
		int genderComp =  p1.getGender().compareTo(p2.getGender());
		if (genderComp != 0){
			return genderComp;
		}
		return p1.getLastName().compareTo(p2.getLastName());  
				
	}
}
