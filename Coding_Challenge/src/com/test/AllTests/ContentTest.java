package com.test.challenge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContentTest {

	@Test 
	public void checkDateFormat1(){

		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.text.ParseException.class, () -> { cc.manipulateDate("Mar-3-1985"); }, "Parse Exception should be thrown");
		System.out.println("1: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Date Format is not recognised");
	}

	@Test 
	public void checkDateFormat2(){

		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.text.ParseException.class, () -> { cc.manipulateDate("1985-3-3"); }, "Parse Exception should be thrown");
		System.out.println("2: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Date Format is not recognised");
	}

	@Test 
	public void checkDateFormat3(){

		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.text.ParseException.class, () -> { cc.manipulateDate("1985/3/3"); }, "Parse Exception should be thrown");
		System.out.println("3: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Date Format is not recognised");
	}

	@Test 
	public void checkDateFormat4(){

		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.text.ParseException.class, 
				() -> { 
					cc.manipulateDate("3-Mar-1985"); 
					fail("Parse Exception should be thrown");
				});
		System.out.println("4: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Date Format is not recognised");
	}

	@Test 
	public void checkDateFormat5(){


		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.lang.AssertionError.class, 
				() -> {
					String date = cc.manipulateDate("3-3-1985"); 
					fail("Expected an exception, but returned "+date);
				});
		System.out.println("5: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Expected an exception, but returned 3/3/1985");
	}

	@Test 
	public void checkDateFormat6(){

		CommaContent cc = new CommaContent();
		Throwable thrown = assertThrows(java.lang.AssertionError.class, 
				() -> {
					String date = cc.manipulateDate("3/3/1985"); 
					fail("Expected an exception, but returned "+date);
				});
		System.out.println("6: "+thrown.getMessage());
		assertEquals(thrown.getMessage(),"Expected an exception, but returned 3/3/1985");
	}

	@Test
	public void checkGenderForFemale() {
		CommaContent cc = new CommaContent();
		String inputString = "F";
		String gender = cc.getGenderString(inputString);
		assertEquals(gender,"Female");

	}

	@Test
	public void checkGenderForMale() {
		CommaContent cc = new CommaContent();
		String inputString = "M";
		String gender = cc.getGenderString(inputString);
		assertEquals(gender,"Male");

	}
	

	@Test
	public void checkGenderForFemale1() {
		CommaContent cc = new CommaContent();
		String inputString = "Female";
		String gender = cc.getGenderString(inputString);
		assertEquals(gender,"Female");

	}

	@Test
	public void checkGenderForMale2() {
		CommaContent cc = new CommaContent();
		String inputString = "Male";
		String gender = cc.getGenderString(inputString);
		assertEquals(gender,"Male");

	}


}
