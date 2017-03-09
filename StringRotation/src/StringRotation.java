import java.util.Scanner;

public class StringRotation {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String input1=sc.nextLine();
		String input2=sc.nextLine();
		System.out.println(isRotation(input1, input2));		
		sc.close();
	}
	
	public static boolean isRotation(String input1,String input2){
		if(input1.length()==input2.length() && input1.length()>0 && (input1+input1).contains(input2)){
				return true;
		}
		return false;
	}
}
