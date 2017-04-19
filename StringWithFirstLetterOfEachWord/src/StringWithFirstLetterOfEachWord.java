/*
Given a string containing words separated by arbitrary number of spaces. Write a function that returns a string consisting of the first letter of each word. (Note: there may be any number of spaces at the starting of the given string, at the end of the given string or in between words of the string.)
Example:
Input: ” this is a test case ”
Output: tiatc
 */

import java.util.Scanner;

public class StringWithFirstLetterOfEachWord {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i < input.length(); i++ ){
			if(input.charAt(i)!=' '){
				sb.append(input.charAt(i));
				int j=i+1;
				while(j<input.length() && input.charAt(j)!=' '){
					j++;
				}
				i=j;
			}
		}
		System.out.println(sb.toString());
		sc.close();
	}

}
