package firstRepeatedChar;

import java.util.HashMap;
import java.util.Scanner;

public class FirstRepetedChar {
	public static void main(String args[]){
		HashMap <Character, Integer> strMap = new HashMap<Character, Integer>();
		Scanner sc = new Scanner(System.in);
			String str=sc.nextLine();
			for(int j=0;j<str.length();j++){
				if(strMap.containsKey(str.charAt(j))){
					strMap.put(str.charAt(j), strMap.get(str.charAt(j))+1);
				}
				else{
					strMap.put(str.charAt(j),1);
				}
			}
			for(int k=0;k<str.length();k++){
				if(strMap.get(str.charAt(k))>1){
					System.out.println(str.charAt(k));
					break;
				}
			}
		sc.close();
	}
}
