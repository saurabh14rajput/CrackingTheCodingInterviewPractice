import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(isPalidromePermutation(input));
		sc.close();
	}
	
	public static boolean isPalidromePermutation(String input){
		input=input.replace(" ", "").toLowerCase();
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		int oddCharCount=0;
		for(int i=0;i<input.length();i++){
			if(charCount.containsKey(input.charAt(i))){
				charCount.put(input.charAt(i), charCount.get(input.charAt(i))+1);
			}
			else{
				charCount.put(input.charAt(i), 1);
			}
		}
		for(Character c: charCount.keySet()){
			if(charCount.get(c)%2!=0){
				oddCharCount++;
			}
			if(oddCharCount>1){
				return false;
			}
		}
		
		return true;
	}
}
