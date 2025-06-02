package com.filehandling.text;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void create(String fileName) {

		try {

			File file = new File(fileName);
			if (file.createNewFile()) {
				System.out.println("File Created : " + file.getName());
			} else {
				System.out.println("File alredy exists : " + file.getName());
			}
		} catch (Exception e) {
			System.out.println("An error occurred : " + e.getMessage());
		}
	}
}
