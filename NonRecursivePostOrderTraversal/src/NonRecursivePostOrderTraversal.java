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


public class NonRecursivePostOrderTraversal {
	public static void main(String[] args){
		Node root=createTree();
		postOrder(root);
	}
	
	public static void postOrder(Node root){
		if(root==null){
			return;
		}
		Stack<Node> postStack=new Stack<Node>();
		Node curr=root;
		
		while(curr!=null || !postStack.isEmpty()){
			while(curr!=null){
				if(curr.right!=null){
					postStack.push(curr.right);
				}
				postStack.push(curr);
				curr=curr.left;
			}
			Node popped=postStack.pop();
			if(popped.right!=null && !postStack.isEmpty() && postStack.peek()==popped.right){
				postStack.pop();
				postStack.push(popped);
				curr=popped.right;
			}
			else{
				System.out.println(popped.data);
			}
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
