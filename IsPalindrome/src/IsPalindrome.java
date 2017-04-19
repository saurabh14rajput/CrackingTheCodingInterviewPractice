import java.util.Scanner;
import java.util.Stack;

public class IsPalindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		boolean result=isPalindrome(input);
		if(result){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		sc.close();
	}
	//first brute force solution
	public static boolean isPalindrome(String input){
		String inputFiltered=input.replaceAll("[^A-Za-z]", "");
		String inputLowerCase=inputFiltered.toLowerCase();
		System.out.println(inputLowerCase);
		int i=0;
		int j=inputLowerCase.length()-1;
		while(i<j){
			if(inputLowerCase.charAt(i)!=inputLowerCase.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	//Solution using stack
	public static boolean isPalindromeStack(String input){
		String inputFiltered=input.replaceAll("[^A-Za-z]", "");
		String inputLowerCase=inputFiltered.toLowerCase();
		System.out.println(inputLowerCase);
		Stack<Character> halfString=new Stack<Character>();
		
		for(int i=0;i<inputLowerCase.length()/2;i++){
			halfString.push(inputLowerCase.charAt(i));
		}
		
		if(inputLowerCase.length()%2==0){
			for(int i=inputLowerCase.length()/2;i<inputLowerCase.length();i++){
				if(inputLowerCase.charAt(i)!=halfString.pop()){
					return false;
				}
			}
		}
		
		else{
			for(int i=(inputLowerCase.length()/2)+1;i<inputLowerCase.length();i++){
				if(inputLowerCase.charAt(i)!=halfString.pop()){
					return false;
				}
			}
		}
		return true;
	}
}
