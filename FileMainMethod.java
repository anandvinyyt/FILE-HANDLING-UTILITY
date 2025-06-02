package com.filehandling.text;

public class FileMainMethod {

	public static void main(String[] args) {

		String dataToWrite = "Hy everyone !! I'm Vineet Anand, working on File Handling Utility. \n"
				+ "How about you?? \nI'm from India and where are you from?";

		//Create New File
		CreateFile.create(Constants.FILE_NAME_SAMPLE);
		System.out.println("====================================================");
		
		//Write data in a file
		WriteToFile.writeFile(Constants.FILE_NAME_SAMPLE, dataToWrite);
		System.out.println("====================================================");
		
		//Read data from file
		ReadFromFile.readFile(Constants.FILE_NAME_SAMPLE);
		System.out.println("====================================================");
	}

}
