package com.infotech.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Path path = Paths.get("abc.txt");
		System.out.println(path);
		try(Stream<String> stream = Files.lines(path))
		{
			stream.forEach(System.out::println);
		}
	}

}
