class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}

public class DeleteMiddleNode {
	public static void main(String []args){
		Node head=createDummyList();
		
		Node someMiddleNode=head.next.next.next.next.next;
		System.out.println("Node to delete " +someMiddleNode.data);
		
		deleteSomeMiddleNode(someMiddleNode);
		
		System.out.println("After deletion");
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public static void deleteSomeMiddleNode(Node someMiddleNode){
	//copy the data from the next node to the current node
	//Then delete the next node
		Node nextNode=someMiddleNode.next;
		someMiddleNode.data=nextNode.data;
		someMiddleNode.next=nextNode.next;
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
