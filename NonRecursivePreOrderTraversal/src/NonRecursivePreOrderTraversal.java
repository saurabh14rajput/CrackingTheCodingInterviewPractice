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


public class NonRecursivePreOrderTraversal {
	public static void main(String[] args){
		Node root=createTree();
		nonRecursivePreOrder(root);
	}
	
	public static void nonRecursivePreOrder(Node root){
		if(root==null){
			return;
		}
		Stack<Node> preStack= new Stack<Node>();
		preStack.push(root);
		while(!preStack.isEmpty()){
			Node popped=preStack.pop();
			System.out.println(popped.data);
			if(popped.right!=null){
				preStack.push(popped.right);
			}
			if(popped.left!=null){
				preStack.push(popped.left);
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
