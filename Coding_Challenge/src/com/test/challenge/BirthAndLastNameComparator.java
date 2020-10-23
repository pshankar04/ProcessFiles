package com.test.challenge;

import java.text.SimpleDateFormat;
import java.util.Comparator;

public class BirthAndLastNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		int compareId;
		try {
			SimpleDateFormat f = new SimpleDateFormat("M/d/yyyy");
			compareId = (f.parse(p1.getDateOfbirth())).compareTo(f.parse(p2.getDateOfbirth()));
			if (compareId != 0) {
				return compareId;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return p1.getLastName().compareTo(p2.getLastName());
	}
}
