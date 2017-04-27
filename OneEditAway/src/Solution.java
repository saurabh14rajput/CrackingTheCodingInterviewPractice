import java.util.Scanner;

public class Solution {
	public static void main(String[] agrs){
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		System.out.println(isOneEditAway(input1, input2));
		sc.close();
	}
	
	public static boolean isOneEditAway(String s1, String s2){
		if(s1.length()==s2.length()){
			return isOneReplaceAway(s1, s2);
		}
		else if(s1.length()+1==s2.length()){
			return isOneInsertAway(s1,s2);
		}
		else if(s1.length()-1==s2.length()){
			return isOneInsertAway(s2,s1);
		}
		return false;
	}
	
	public static boolean isOneReplaceAway(String s1, String s2){
		boolean anomally=false;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				if(anomally){
					return false;
				}
				anomally=true;
			}
		}
		return true;
	}
	
	public static boolean isOneInsertAway(String s1, String s2){
		int index1=0;
		int index2=0;
		while(index2<s2.length() && index1<s1.length()){
			if(s1.charAt(index1)!=s2.charAt(index2)){
				if(index1!=index2){
					return false;
				}
				index2++;
			}
			else{
				index1++;
				index2++;
			}
		}
		return true;
	}
}
