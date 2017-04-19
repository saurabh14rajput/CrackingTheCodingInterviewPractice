/*Given a linked list, write a function to reverse every k nodes (where k is an input to the function).
Example:
Inputs: 1->2->3->4->5->6->7->8->NULL and k = 3
Output: 3->2->1->6->5->4->8->7->NULL.
Inputs: 1->2->3->4->5->6->7->8->NULL and k = 5
Output: 5->4->3->2->1->8->7->6->NULL.
*/


class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
		next=null;
	}
} 

public class ReverseLinkedListEveryKNumbers {
	public static void main(String[] args){
		int[] input={1,2,3,4,5,6,7,8};
		Node head=createDummyList(input);
		printList(head);
		head=reverseEveryK(head, 3);
		printList(head);
	}
	
	public static Node reverseEveryK(Node head, int k){
		Node prev=null;
		Node curr=head;
		Node next=null;
		int count=0;
		while(count < k && curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			count++;
		}
		if(next!=null){
			head.next=reverseEveryK(next,k);
		}
		return prev;
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
