class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}

public class Partition {
	public static void main(String []args){
		Node head=createDummyList();
		int k=3;
		head=partitionConcise(head,k);
		System.out.println("After dpartition");
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	//first solution
	public static Node partition(Node head,int k){
		Node leftHead = null;
		Node leftTail = null;
		Node rightHead = null;
		Node rightTail= null;
		
		while(head!=null){
			if(head.data<k){
				if(leftHead==null){
					leftHead=head;
					leftTail=leftHead;
				}
				else{
					leftTail.next=head;
					leftTail=leftTail.next;
				}
			}
			else{
				if(rightHead==null){
					rightHead=head;
					rightTail=rightHead;
				}
				else{
					rightTail.next=head;
					rightTail=rightTail.next;
				}
			}
			head=head.next;
		}
		
		if(rightHead==null){
			return leftHead;
		}
		leftTail.next=rightHead;
		return leftHead;
	}
	
	
	//A more concise (not necessarily clear) solution
	
	public static Node partitionConcise(Node curr,int k){
		Node head=curr;
		Node tail=curr;
		while(curr!=null){
			System.out.println("Log: "+curr.data);
			Node next=curr.next;
			if(curr.data<k){
					curr.next=head;
					head=curr;
			}
			else{
				tail.next=curr;
				tail=curr;
			}
			curr=next;
		}
		tail.next=null;
		return head;
	}
	
	
	
	public static Node createDummyList(){
		int input[] ={2,2,2,3,0,1,4,2,6,7,3,3};
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
