class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}

public class MinimalBST {
	public static void main(String[] args){
		int[] input={1,2,3,4,5,6,7,8,9};
		Node node=createMinimalBST(input);
		inOrder(node);
		
	}
	
	public static Node createMinimalBST(int[] input){
		return createMinimalBST(input,0,input.length-1);
	}
	
	public static Node createMinimalBST(int[] input, int start, int end){
		if(start>end){
			return null;
		}
		int mid=(start+end)/2;
		Node node=new Node(input[mid]);
		node.left=createMinimalBST(input, start, mid-1);
		node.right=createMinimalBST(input, mid+1, end);
		return node;
	}
	//print nodes inOrder traversal
	public static void inOrder(Node node){
		if(node==null){
			return;
		}
		inOrder(node.left);
		System.out.println(node.data);
		inOrder(node.right);
	}
}
