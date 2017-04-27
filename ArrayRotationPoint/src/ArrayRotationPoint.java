
public class ArrayRotationPoint {
	public static void main(String[] args){
		int[] input={10,11,12,13,14,1,2,3,4,5,6,7,8,9};
		System.out.println(getRotationPoint(input));
		
	}
	public static int getRotationPoint(int[] input){
		int low=0;
		int high=input.length-1;
		int mid;
		while(input[low]>input[high]){
			mid=(low+high)/2;
			if(input[low]>input[mid]){
				high=mid;
			}else{
				low=mid+1;
			}
		}
		return low;
	}
}
