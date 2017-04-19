class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
}


public class ReverseTheList {
	public static void main(String[] args){
		int[] input={1,2,3,4,5,6,7,8};
		Node head=createDummyList(input);
		printList(head);
		head=reverse(head);
		printList(head);
		
	}
	public static Node reverse(Node head){
		if(head==null){
			return null;
		}
		Node prev=null;
		Node curr=head;
		Node next=null;
		
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		return prev;
	}
	
	public static Node createDummyList(int[] input){
		//int input[] ={7,1,6};
		if(input==null){
			return null;
		}
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
