
class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
		next=null;
	}
	Node(){
	}
} 

public class SumLists {

	public static void main(String args[]){
		int[] input1={7,1,6,9};
		Node head1=createDummyList(input1);
		System.out.println("List created.");
		printList(head1);
		int[] input2={5,9,2};
		Node head2=createDummyList(input2);
		System.out.println("List created.");
		printList(head2);
		
		Node head3=sumLists(head1,head2);
		System.out.println("Both Added");
		printList(head3);
		
	}
	//recursive solution
	public static Node sumLists(Node head1,Node head2){
		return sumNodes(head1,head2,0);
	}
	
	public static Node sumNodes(Node node1, Node node2, int carry){
		if(node1==null && node2==null && carry==0){
			return null;
		}
		Node result=new Node();
		int value=carry;
		if(node1!=null){
			value+=node1.data;
		}
		if(node2!=null){
			value+=node2.data;
		}
		result.data=value%10;
		//recursion
		if(node1!=null || node2!=null){
			Node resultMore=sumNodes(node1==null?null:node1.next, node2==null?null:node2.next,value>10?1:0);
			result.next=resultMore;
		}
		return result;	
	}
	
	
	public static Node createDummyList(int[] input){
		//int input[] ={7,1,6};
		Node head=new Node(input[0]);
		Node temp=head;
		for(int i=1;i<input.length;i++){
			Node node=new Node(input[i]);
			temp.next=node;
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



