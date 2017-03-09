package k.sum.pair.pacakage;

import java.util.HashMap;

public class KsumPair {
	public static void main(String []args ){
		int k=7;
		int input[]={2,11,6,2,14,4,7,9,12,5,0};
		int twice_count=0;
		HashMap<Integer, Integer> myHash=new HashMap<Integer, Integer>();
		for(int i=0;i<input.length;i++){
			if(myHash.containsKey(input[i])){
				myHash.put(input[i],myHash.get(input[i])+1);
			}
			else{
				myHash.put(input[i],1);
			}
		}
		
		for(int i=0;i<input.length;i++){
			if(myHash.containsKey(k-input[i])){
				twice_count+=myHash.get(k-input[i]);
			}
			if(k-input[i]==input[i]){
				twice_count--;
			}
		}
		System.out.println(twice_count/2);
	}

	
	
}
