package com.fileparsing.project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FParse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HashMap <String, Integer> wordCount = new HashMap <String, Integer>();
		FileReader input = new FileReader("myFile.txt");
		BufferedReader bufRead = new BufferedReader(input);
		String myLine = null;
		while ( (myLine = bufRead.readLine()) != null)
		{    
		    String[] str = myLine.split(" ");
		    System.out.println("word: "+str[0]+" count: "+str[1]);
		    wordCount.put(str[0], Integer.parseInt(str[1]));
		}
		bufRead.close();

	}

}
