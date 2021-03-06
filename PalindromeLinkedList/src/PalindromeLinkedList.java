import java.util.Stack;

class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}

public class PalindromeLinkedList {
	public static void main(String args[]){
		Node head=createDummyList();
		System.out.println(isPalindromeList(head));
	}
	
	public static boolean isPalindromeList(Node head){
		//let's reverse the list
		Node curr=head;
		Stack<Integer> reverseStack=new Stack<Integer>();
		while(curr!=null){
			reverseStack.push(curr.data);
			curr=curr.next;
		}
		curr=head;
		while(curr!=null){
			if(curr.data!=(int)reverseStack.pop()){
				return false;
			}
			curr=curr.next;
		}
		return true;
	}
	
	public static Node createDummyList(){
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

}
