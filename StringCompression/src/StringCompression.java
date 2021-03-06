import java.util.Scanner;

public class StringCompression {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		System.out.println(compressStringClean(input));
		sc.close();
	}
	//My solution. 
	//Not as clean as it uses extra space and then trims the white spaces in the end
	public static String compressString(String input){
		int gainCount=0;
		for(int i=0;i<input.length();i++){
			if(i+2<input.length()&& input.charAt(i)==input.charAt(i+1) && input.charAt(i)==input.charAt(i+2)){
				gainCount++;
			}
		}
		if(gainCount==0){
			return input;
		}
		
		char charArray[]=new char[input.length()];
		for(int i=0,j=0;i<input.length();i++){
				int currentCount=1;
				char currentChar=input.charAt(i);
				while(i+1<input.length() && input.charAt(i+1)==currentChar){
					currentCount++;
					i++;
				}
				charArray[j]=input.charAt(i);
				charArray[j+1]=(char)(currentCount+'0');
				j+=2;
		}
		return (new String(charArray)).trim();
	}
	
	//Solution in CTCI
	
	public static String compressStringClean(String input){
		int finalLenght=getCompressedLength(input);
		if(input.length()<finalLenght){
			return input;
		}
		int countConsicutive=0;
		StringBuilder compressedString = new StringBuilder(finalLenght);
		for(int i=0;i<input.length();i++){
			countConsicutive++;
			if(i+1>=input.length() || input.charAt(i)!=input.charAt(i+1)){
				compressedString.append(input.charAt(i));
				compressedString.append(countConsicutive);
				countConsicutive=0;
			}
		}
		return compressedString.toString();
	}
	
	public static int getCompressedLength(String input){
		int countConsicutive=0;
		int compressCount=0;
		for(int i=0;i<input.length();i++){
			countConsicutive++;
			if(i+1>=input.length() || input.charAt(i)!=input.charAt(i+1)){
				compressCount+=1+String.valueOf(countConsicutive).length();
				countConsicutive=0;
			}
		}
		return compressCount;
	}
}
