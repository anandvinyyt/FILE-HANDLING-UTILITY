package com.filehandling.text;

import java.io.File;
import java.util.Scanner;

public class ReadFromFile {

	public static void readFile(String fileName) {

		try {

			Scanner scanner = new Scanner(new File(fileName));
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}

		} catch (Exception e) {
			System.out.println("An error occurred : " + e.getMessage());
		}
	}
}
