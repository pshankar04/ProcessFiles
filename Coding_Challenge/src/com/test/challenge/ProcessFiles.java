package com.test.challenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProcessFiles {

	private ContentAggregator contentAggregator = new ContentAggregator();

	public static void main(String[] args) {

		ProcessFiles processFiles = new ProcessFiles();
		processFiles.extractContent();
	}

	/**
	 * Parses the person records from all the text files and saves them as a list of Person objects
	 */

	public void extractContent() {

		try {
			File dir = new File(Constants.TEXT_FILES_DIRECTORY);
			Scanner input;
			String line;

			for (File file : dir.listFiles()) {
				
				if(file != null) {
					input = new Scanner(file);
					
					while(input.hasNextLine()) {
						line = input.nextLine();
						processLine(line);
					}		
					
					input.close();
				}
			}
			contentAggregator.sortAndDisplay();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void processLine(String line) {

		Content contentType;
		
		if(line != null && line.length() > 0) {

			if(Constants.PIPE_PATTERN.matcher(line).matches()) {
				contentType = new PipeContent();		
				
			}else if(Constants.COMMA_PATTERN.matcher(line).matches()) {
				contentType = new CommaContent();
				
			}else {
				contentType = new SpaceContent();
			}
			contentAggregator.populateList(contentType, line);
		}
	}

}
