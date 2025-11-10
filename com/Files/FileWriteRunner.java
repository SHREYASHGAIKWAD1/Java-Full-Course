package com.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path pathFileToWrite = Paths.get("./Resources/write-file.txt");
		
		List<String> list = 
				List.of("Bat", "Cat", "Boy", "Rat", "Apple");
		
		Files.write(pathFileToWrite, list);
	}

}
