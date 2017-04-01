import java.util.HashMap;
import java.util.Stack;

class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}

public class IntersectionLinkedList {
	public static void main(String[] args){
		
		
		int[] input={7,1,6,5,7,9};
		Node head1=new Node(input[0]);
		Node temp=head1;
		for(int i=1;i<input.length;i++){
			Node node=new Node(input[i]);
			temp.next=node;
			temp=temp.next;
		}
		
		int[] input2={13,12,8};
		Node head2=new Node(input2[0]);
		temp=head2;
		for(int i=1;i<3;i++){
			Node node=new Node(input2[i]);
			temp.next=node;
			temp=temp.next;
		}
		Node temp1=head1;
		for(int i=1;i<4;i++){
			temp1=temp1.next;
		}
		temp.next=temp1;
		printList(head1);
		printList(head2);
		System.out.println(areIntersectingLists(head1,head2));
		
	}
	//putting all the nodes of the first list into a hashmap
	//Then comparing the nodes in the second with the ones already in the hashmap
	public static boolean areIntersectingLists(Node head1,Node head2){
		Node curr=head1;
		HashMap<Node, Integer> nodeCount=new HashMap<Node, Integer>();
		while(curr!=null){
			if(nodeCount.containsKey(curr)){
				nodeCount.put(curr, nodeCount.get(curr)+1);
			}
			else{
				nodeCount.put(curr, 1);
			}
			curr=curr.next;
		}
		curr=head2;
		while(curr!=null){
			if(nodeCount.containsKey(curr)){
				return true;
			}
			curr=curr.next;
		}
		return false;
	}
	
	public static Node createDummyLists(){
		int input[] ={2,2,2,2,4,1,4,2,2,2,2};
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
	
	public static void printList(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}

}
