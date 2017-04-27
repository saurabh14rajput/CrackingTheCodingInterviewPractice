package is.permutsation.example;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args){
		System.out.println(isPermutationArray("nahan aha", "ha nahana"));
	}
	//Assuming ASCII character set
	public static boolean isPermutationArray(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		int[] charCount=new int[128];
		for(int i=0;i<s1.length();i++){
			int value=s1.charAt(i);
			charCount[value]++;
		}
		for(int i=0;i<s2.length();i++){
			int value=s2.charAt(i);
			charCount[value]--;
			if(charCount[value]<0){
				return false;
			}
		}
		return true;
	}
	//by sorting and comparing the strings
	public static boolean isPermutationSort(String s1, String s2){
		if(s1.length()!=s2.length()){
			return false;
		}
		return sort(s1).equals(sort(s2));
	}
	public static String sort(String input){
		char[] inputArray=input.toCharArray();
		Arrays.sort(inputArray);
		return new String(inputArray);
	}
}
