import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class dummy {
	public static void main (String[] args) throws java.lang.Exception
	{
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int input = 0;
		int maxCount = 0;
		int highest = 0;
		
		for (int i=0;i<n;i++) {
			input = sc.nextInt();
			if(list.containsKey(input)) {
				list.put(input, list.get(input)+1);
			}
			else {
				list.put(input, 1);
			}
		}
		
		Iterator it = list.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<Integer, Integer> pair = (Map.Entry)it.next();
	        if(pair.getValue()>maxCount){
	        	maxCount=pair.getValue();
	        	highest=pair.getKey();
;	        }
	        else if(pair.getValue()==maxCount){
	        	if(pair.getKey()>highest){
	        		highest=pair.getKey();
	        	}
	        }
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	    System.out.println(highest);

     }
}