
class Node{
	int data;
	Node next;
	//constructor
	Node(int data){
		this.data=data;
		next=null;
	}
} 

public class SumLists {

	public static void main(String args[]){
		int[] input1={7,1,6};
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
	//Simple straightforward solution
	public static Node sumLists(Node head1, Node head2){
		int multiplyer=1;
		int num1=0;
		int num2=0;
		int sum=0;
		while(head1!=null){
			num1+=head1.data*multiplyer;
			head1=head1.next;
			multiplyer=multiplyer*10;
		}
		System.out.println("first number: "+num1);
		multiplyer=1;
		while(head2!=null){
			num2+=head2.data*multiplyer;
			head2=head2.next;
			multiplyer=multiplyer*10;
		}
		System.out.println("second number: "+num2);
		sum=num1+num2;
		System.out.println("Sum: "+sum);
		Node head3=new Node(sum%10);
		Node temp=head3;
		sum=sum/10;
		while(sum>1){
			Node node=new Node(sum%10);
			temp.next=node;
			temp=temp.next;
			sum=sum/10;
		}
		return head3;
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



