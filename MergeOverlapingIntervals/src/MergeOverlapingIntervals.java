import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;
class Interval{
	Integer start;
	Integer end;
	public Interval(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}
	public Integer getStart(){
		return this.start;
	}
}
public class MergeOverlapingIntervals {
	public static void main(String[] args){
		List<Interval> intervals =new ArrayList<Interval>();
		intervals.add(new Interval(1,5));
		intervals.add(new Interval(2,9));
		intervals.add(new Interval(3,6));
		intervals.add(new Interval(17,20));
		intervals.add(new Interval(11,14));
		intervals.add(new Interval(1,7));
		List<Interval> nonOverlapingIntervals=merge(intervals);
		for(Interval interval : nonOverlapingIntervals){
			System.out.println("{"+interval.start+","+interval.end+"}");
		}
	}
	public static List<Interval> merge(List<Interval> intervals){
		Stack<Interval> tempBuffer=new Stack<Interval>();
		List<Interval> nonOverlapingIntervals =new ArrayList<Interval>();
		intervals.sort(new Comparator<Interval>() {
		    public int compare(Interval one, Interval other) {
		        return one.getStart().compareTo(other.getStart());
		    }
		});
		tempBuffer.push(intervals.get(0));
		for(int i=1;i<intervals.size();i++){
			if(intervals.get(i).start<=tempBuffer.peek().end){
				if(intervals.get(i).end>tempBuffer.peek().end){
					Interval temp=tempBuffer.pop();
					temp.end=intervals.get(i).end;
					tempBuffer.push(temp);
				}
			}else{
				tempBuffer.push(intervals.get(i));
			}
		}
		while(!tempBuffer.isEmpty()){
			nonOverlapingIntervals.add(tempBuffer.pop());
		}
		return nonOverlapingIntervals;
	}
}
