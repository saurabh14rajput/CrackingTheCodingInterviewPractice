import java.util.Scanner;

public class oneEditAway {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		System.out.println(isOneEditAway(input1, input2));
		sc.close();
	}
	
	public static boolean isOneEditAway(String input1, String input2){
		boolean result=false;
		if(input1.length()==input2.length()){
			result=isOneReplacementAway(input1, input2);
		}
		else if(input1.length()+1==input2.length()){
			result=isOneInsertAway(input1, input2);
		}
		else if(input1.length()-1==input2.length()){
			result=isOneInsertAway(input2, input1);
		}
		else{
			result=false;
		}
		return result;
	}
	
	public static boolean isOneReplacementAway(String input1, String input2){
		boolean anomalyFound=false;
		for(int i=0;i<input1.length();i++){
			if(input1.charAt(i)!=input2.charAt(i)){
				if(anomalyFound){
					return false;
				}
				else{
					anomalyFound=true;
				}
			}
		}
		return true;
	}
	
	public static boolean isOneInsertAway(String smallerString, String largerString){
		int i=0,j=0;
		while(i<largerString.length() && j<smallerString.length()){
			if(largerString.charAt(i)!=smallerString.charAt(j)){
				if(i!=j){
					return false;
				}
				i++;
			}
			else{
				i++;
				j++;
			}
		}
		return true;
	}
}
