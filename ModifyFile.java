package com.filehandling.text;

	import java.io.*;

	public class ModifyFile {

	    public static void modifyFile(String filePath) {
	        File inputFile = new File(filePath);
	        File tempFile = new File("temp_" + inputFile.getName());

	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	            PrintWriter writer = new PrintWriter(new FileWriter(tempFile))
	        ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String modifiedLine = line.replaceAll(filePath, line);
	                writer.println(modifiedLine);
	            }

	            // Replace original file with the modified file
	            if (inputFile.delete()) {
	                if (!tempFile.renameTo(inputFile)) {
	                    System.err.println("Failed to rename temp file.");
	                } else {
	                    System.out.println("File modified successfully.");
	                }
	            } else {
	                System.err.println("Failed to delete original file.");
	            }

	        } catch (IOException e) {
	            System.err.println("Error modifying file: " + e.getMessage());
	        }
	    }
	}


