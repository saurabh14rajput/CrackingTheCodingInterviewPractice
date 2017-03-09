import java.util.HashMap;
import java.util.Scanner;

public class PalindromePermutation {
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(isPalinPermu2(input));
		sc.close();
	}
	
	public static boolean isPalinPermu(String input){
		input=input.replace(" ", "");
		HashMap<Character, Integer> charHash=new HashMap<Character, Integer>();
		int count=0;
		for(int i=0;i<input.length();i++){
			if(charHash.containsKey(input.charAt(i))){
				charHash.put(input.charAt(i), charHash.get(input.charAt(i))+1);
			}
			else{
				charHash.put(input.charAt(i), 1);
			}
		}
		for(Character key: charHash.keySet()){
			if(charHash.get(key)%2!=0){
				count++;
			}
			if(count>1)
				return false;
		}
		return true;
	}
	
	public static boolean isPalinPermu2(String input){
		input=input.replace(" ", "");
		HashMap<Character, Integer> charHash=new HashMap<Character, Integer>();
		int oddCount=0;
		for(int i=0;i<input.length();i++){
			if(charHash.containsKey(input.charAt(i))){
				charHash.put(input.charAt(i), charHash.get(input.charAt(i))+1);
				if(charHash.get(input.charAt(i))%2!=0)
					oddCount++;
				else
					oddCount--;
			}
			else{
				charHash.put(input.charAt(i), 1);
				oddCount++;
			}
		}
		if(oddCount>1)
			return false;
		return true;
	}
}
