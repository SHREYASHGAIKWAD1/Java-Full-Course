package com.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException, InterruptedException {
		Path pathFileToRead = Paths.get("./Resources/data.txt");
		//List<String> lines = Files.readAllLines(pathFileToRead);
		//System.out.println(lines);
		
		Files.lines(pathFileToRead).map(String::toLowerCase).forEach(System.out::println);
	}

}
