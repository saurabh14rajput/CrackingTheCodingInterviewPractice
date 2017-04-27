import java.util.Scanner;

public class Solution {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(urlify(input));
		char[] input2={'h','n',' ','h','n',' ','h','n',' ','h','n',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '};
		urlifyArray(input2,11);
		sc.close();
	}
	
	//using the replaceAll method. But its not efficient
	public static String urlify(String input){
		return input.replaceAll(" ", "%20");
	}
	//Lets do it using an array of chars.
	public static void urlifyArray(char[] input, int trueLength){
		int spaceCount=0;
		for(int i=0;i<trueLength;i++){
			if(input[i]==' '){
				spaceCount++;
			}
		}
		int index=trueLength+(spaceCount*2);
		for(int i=trueLength-1;i>=0;i--){
			if(input[i]!=' '){
				input[index-1]=input[i];
				index--;
			}
			else{
				input[index-1]='0';
				input[index-2]='2';
				input[index-3]='%';
				index=index-3;
			}
		}
		for(int i=0;i<trueLength+(spaceCount*2);i++){
			System.out.print(input[i]);
		}
	}
}
