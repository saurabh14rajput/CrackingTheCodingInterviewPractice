import java.util.HashMap;

class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}

public class RemoveDups {
	public static void main(String []args){
		Node head=createDummyList();
		head=removeDups(head);
	}
	
	public static Node removeDups(Node head){
		HashMap<Integer, Integer> dataHash= new HashMap<Integer, Integer>();
		Node curr=head;
		Node prev=curr;
		while(curr!=null){
			if(dataHash.containsKey(curr.data)){
				//delete dupe
				prev.next=curr.next;				
			}
			else{
				//add to hashMap
				dataHash.put(curr.data, 1);
				prev=curr;
			}
			curr=curr.next;
		}
		System.out.println("No Dupes now!");
		curr=head;
		while(curr!=null){
			System.out.println(curr.data);
			curr=curr.next;
		}
		return head;
	}
	
	public static Node createDummyList(){
		int input[] ={2,2,2,3,4,2,6,7,3,3};
		Node head=new Node(input[0]);
		Node temp=head;
		for(int i=1;i<input.length;i++){
			Node node=new Node(input[i]);
			temp.next=node;
			temp=temp.next;
		}
		temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
		return head;
	}
}
