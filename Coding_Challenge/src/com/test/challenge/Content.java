package com.test.challenge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public abstract class Content {

	public abstract Person handleContent(String record);

	/**
	 * Converts the date format found in the text files to a target format "M/d/yyyy"
	 * @param dob - date of birth
	 * @return - formatted date
	 */

	public String manipulateDate(String dob) throws ParseException{

		Date date;
		String dateString = "";

		SimpleDateFormat slashFormat = new SimpleDateFormat(Constants.TARGET_DATE_FORMAT);
		SimpleDateFormat dashFormat = new SimpleDateFormat(Constants.INITIAL_DATE_FORMAT);

		if(matches(Constants.DASH_DATE_PATTERN, dob)) {
			date = dashFormat.parse(dob);
			dateString = slashFormat.format(date);
			return dateString;

		}else if(matches(Constants.FWD_SLASH_DATE_PATTERN, dob)) {
			return dob;

		}else {
			throw new ParseException("Date Format is not recognised",1);
		}

	}

	/**
	 * Returns the full-word of the gender if it is abbreviated.
	 * @param gender
	 * @return
	 */

	public String getGenderString(String gender) {

		if(gender.equals("F")) {
			return Constants.FEMALE;
		}else if(gender.equals("M")) {
			return Constants.MALE;
		}else {
			return gender;
		}	
	}


	/**
	 * Returns a date pattern allowed to parse
	 * @param pattern - Dash or forward slash
	 * @param date - input date of birth
	 * @return - True, if input date matches allowed date formats (M/d/yyyy or M-d-yyyy) or False otherwise
	 */

	public boolean matches(Pattern pattern, String date) {
		if(pattern.matcher(date).matches()){
			return true;
		}else if(pattern.matcher(date).matches()) {
			return true;
		}else {
			return false;
		}

	}

}
