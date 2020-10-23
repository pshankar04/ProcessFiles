package com.test.challenge;

import java.util.regex.Pattern;

public class Constants {
	/**
	 * Output string for the output
	 */
	
	public static final String OUTPUT = "Output ";
	
	/**
	 * MALE constant variable string for Male
	 */
	public static final String MALE = "Male";
	
	/**
	 * FEMALE constant variable string for Female 
	 */
	public static final String FEMALE = "Female";
	
	/**
	 * Target date format for the output
	 */
	public static final String TARGET_DATE_FORMAT = "M/d/yyyy";
	
	/**
	 * Initial date format in the input
	 */
	public static final String INITIAL_DATE_FORMAT = "M-d-yyyy";
	
	/**
	 * Comma delimiter
	 */
	public static final String COMMA_DELIMITER = ",";
	
	/**
	 * Pipe delimiter
	 */
	public static final String PIPE_DELIMITER = "\\|";
	
	/**
	 * Space delimiter
	 */
	public static final String SPACE_DELIMITER = " ";
	
	/**
	 * Hyphen date format pattern
	 */
	public static final Pattern DASH_DATE_PATTERN = Pattern.compile("^\\d{0,2}-\\d{0,2}-\\d{4}$");
	
	/**
	 * Forward slash date format pattern
	 */
	public static final Pattern FWD_SLASH_DATE_PATTERN = Pattern.compile("^\\d{0,2}/\\d{0,2}/\\d{4}$");
	
	/**
	 * Comma Pattern of file content
	 */
	public static final Pattern COMMA_PATTERN = Pattern.compile("[A-Za-z]*,\\s[A-Za-z]*,\\s(Male|Female),\\s[A-Za-z]*,\\s\\d{1,2}\\/\\d{1,2}\\/\\d{4}");
	
	/**
	 * Space pattern of file content
	 */
	public static final Pattern SPACE_PATTERN = Pattern.compile("[A-Za-z]*\\s[A-Za-z]*\\s[A-Z]{1}\\s(M|F)\\s\\d{1,2}-\\d{1,2}-\\d{4}\\s[A-Za-z]*");
	
	/**
	 * Pipe pattern of file content
	 */
	public static final Pattern PIPE_PATTERN = Pattern.compile("[A-Za-z]*\\s\\|\\s[A-Za-z]*\\s\\|\\s[A-Z]{1}\\s\\|\\s(M|F)\\s\\|\\s[A-Za-z]*\\s\\|\\s\\d{1,2}-\\d{1,2}-\\d{4}");
	
	/**
	 * Path for text file directory
	 */
	public static final String TEXT_FILES_DIRECTORY = "/Users/puneethshankar/Desktop/def_method_test/Input_Files";

}
