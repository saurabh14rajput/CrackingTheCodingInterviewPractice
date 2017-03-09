import java.util.Scanner;

public class Urilify {
	public static void main(String []args){
		Scanner sc= new Scanner (System.in);
		String input=sc.nextLine();
		String result=urlify(input);
		System.out.println(result);
		sc.close();
	}
	
	public static String urlify(String input){
		int count=0;
		//char inputArray[]=input.toCharArray();
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				count++;
			}
		}
		char inputArray[]= new char[input.length()+(count*3)];
		for(int i=0,j=0;i<input.length();i++){
			if(input.charAt(i)==' '){
				inputArray[j]='%';
				inputArray[j+1]='2';
				inputArray[j+2]='0';
				j=j+3;
			}
			else{
				inputArray[j]=input.charAt(i);
				j++;
			}
		}
		return new String(inputArray);
	}
}
