package is.unique;

import java.util.HashMap;
import java.util.Scanner;

public class IsUnique {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(isUnique(input));
		sc.close();
	}
	
	public static boolean isUnique(String input){
		HashMap<Character, Integer> uniqueMap= new HashMap<Character, Integer>();
		for(int i=0;i<input.length();i++){
			if(uniqueMap.containsKey(input.charAt(i))){
				return false;
			}
			else{
				uniqueMap.put(input.charAt(i),1);
			}
		}
		return true;
	}
}
