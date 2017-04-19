import java.util.EmptyStackException;

public class MyStack<T> {
	private static class Node<T>{
		private T data;
		private Node<T> next;
		private Node(T data){
			this.data=data;
			this.next=null;
		}
	}
	
	private Node<T> top;
	
	public T peek(){
		if(top==null){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public boolean isEmpty(){
		if(top==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Node<T> pop(){
		if(top==null){
			throw new EmptyStackException();
		}
		Node<T> node=top;
		top=top.next;
		return node;
	}
	
	public void push(T data){
		Node<T> newNode=new Node<T>(data);
		newNode.next=top;
		top=newNode;
	}
}
