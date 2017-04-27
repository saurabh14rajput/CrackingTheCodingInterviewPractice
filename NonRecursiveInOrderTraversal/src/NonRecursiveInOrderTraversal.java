import java.util.Stack;

class Node{
	char data;
	Node left;
	Node right;
	Node(char data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
public class NonRecursiveInOrderTraversal {
	public static void main(String[] args){
		Node root=createTree();
		nonRecursiveInOrder(root);
	}
	
	public static void nonRecursiveInOrder(Node root){
		if(root==null){
			return;
		}
		Stack<Node> inStack=new Stack<Node>();
		Node curr=root;
		
		while(curr!=null || !inStack.isEmpty()){
			while(curr!=null){
				inStack.push(curr);
				curr=curr.left;
			}
			Node popped= inStack.pop();
			System.out.println(popped.data);
			curr=popped.right;
		}
	}
	
	public static Node createTree(){
	    Node a=new Node('a');
	    Node b=new Node('b');
	    Node c=new Node('c');
	    Node d=new Node('d');
	    Node e=new Node('e');
	    Node f=new Node('f');
	    a.left=b;
	    a.right=c;
	    b.left=d;
	    b.right=e;
	    e.left=f;
	    return a;
	  }  
}
