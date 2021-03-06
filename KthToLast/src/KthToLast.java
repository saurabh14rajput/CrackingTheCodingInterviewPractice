class Counter{
	int count=0;
}

class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
	}
}


public class KthToLast {
	public static void main(String []args){
	Node head=createDummyList();
	int k=4;
	//Node resultNode=my_kNodeFromLast(head,k);
	//int index=recursiveKthNodeFromLast(head,k);
	//System.out.println(resultNode.data);
	//System.out.println(index);
	Node node=betterSolutionKthNodeFromLast(head, k);
	System.out.println(k+"th term from the last is "+node.data);
	
	}
	
	public static Node my_kNodeFromLast(Node head, int k){
		int nodeCount=0;
		int equivalentCountFromStart=0;
		Node curr=head;
		while(curr!=null){
			nodeCount++;
			curr=curr.next;
		}
		equivalentCountFromStart=(nodeCount-k)+1;
		curr=head;
		for(int i=1;i<equivalentCountFromStart;i++){
			curr=curr.next;
		}
		return curr;
	}
	
	public static int recursiveKthNodeFromLast(Node head, int k){
		if(head==null){
			return 0;
		}
		int index=recursiveKthNodeFromLast(head.next,k)+1;
		if(index==k){
			System.out.println("The "+k+"th node from last is "+head.data );
		}
		return index;
	}
	
	public static Node betterSolutionKthNodeFromLast(Node head, int k){
		Counter counter=new Counter(); 
		return betterSolutionKthNodeFromLast(head, k,counter);
	}
	public static Node betterSolutionKthNodeFromLast(Node head, int k, Counter counter){
		if(head==null){
			return null;
		}
		Node node=betterSolutionKthNodeFromLast(head.next,k,counter);
		counter.count=counter.count+1;
		if(counter.count==k){
			return head;
		}
		return node;
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
