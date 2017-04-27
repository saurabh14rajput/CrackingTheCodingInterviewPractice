package is.unique;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		if(isUniqueHash(input)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		sc.close();
	}
	
	//if we can use extra data structure. O(n)
	public static boolean isUniqueHash(String input){
		if(input.length()==1){
			return true;
		}
		else if(input.length()==0){
			throw new RuntimeException("Empty string!");
		}
		HashMap<Character, Integer> charFreq = new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++){
			if(charFreq.containsKey(input.charAt(i))){
				//charFreq.put(input.charAt(i), charFreq.get(input.charAt(i))+1);
				return false;
			}
			else{
				charFreq.put(input.charAt(i), 1);
			}
		}
		return true;
	}
	
	//if we can not use extra data structure. O(n^2)
	public static boolean isUniqueNaive(String input){
		if(input.length()==1){
			return true;
		}
		else if(input.length()==0){
			throw new RuntimeException("Empty string!");
		}
		
		for(int i=0;i<input.length();i++){
			char currChar=input.charAt(i);
			for(int j=i+1;j<input.length();j++){
				if(currChar==input.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
	
	//Using a boolean array as a hash-table
	public static boolean isUniqueArray(String input){
		if(input.length()>128){ //assuming the ASCII character set.
			return false;
		}
		else if(input.length()==1){
			return true;
		}
		else if(input.length()==0){
			throw new RuntimeException("Empty string!");
		}
		boolean[] charSet=new boolean[128];
		for(int i=0;i<input.length();i++){
			int index=input.charAt(i);
			if(charSet[index]){
				return false;
			}
			else{
				charSet[index]=true;
			}
		}
		return true;
	}
}
