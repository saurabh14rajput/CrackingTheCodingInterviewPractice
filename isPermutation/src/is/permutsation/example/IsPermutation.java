package is.permutsation.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class IsPermutation {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input1=sc.next() ;
		System.out.println(input1);
		String input2=sc.next();
		System.out.println(input2);
		
		if(isPermutation2(input1,input2)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		sc.close();
	}
	
	public static boolean isPermutation1(String input1,String input2){
		if(input1.length()!=input2.length()){
			return false;
		}
		HashMap<Character, Integer> hashStr1=new HashMap<Character, Integer>();
		HashMap<Character, Integer> hashStr2=new HashMap<Character, Integer>();
		for(int i=0;i<input1.length();i++){
			if(hashStr1.containsKey(input1.charAt(i))){
				hashStr1.put(input1.charAt(i), hashStr1.get(input1.charAt(i))+1);
			}
			else{
				hashStr1.put(input1.charAt(i),1);
			}	
			
			if(hashStr2.containsKey(input2.charAt(i))){
				hashStr2.put(input2.charAt(i), hashStr2.get(input2.charAt(i))+1);
			}
			else{
				hashStr2.put(input2.charAt(i),1);
			}	
		}
		for(int i=0;i<input1.length();i++){
			if(hashStr1.get(input1.charAt(i))!=hashStr2.get(input1.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPermutation2(String input1,String input2){
		if(input1.length()!=input2.length()){
			return false;
		}
		if(!sortString(input1).equals(sortString(input2))){
			return false;
		}
		return true;
	}
	
	public static String sortString(String input){
		char temp[]=input.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
}
