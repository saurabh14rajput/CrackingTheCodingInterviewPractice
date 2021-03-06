package hash.table.imple;
class Node<K,V>{
	K key;
	V value;
	Node<K,V> next;
	
	Node(K key,V value){
		this.key=key;
		this.value=value;
	}
}

public class HashTable<K,V> {
	@SuppressWarnings("unchecked")
	private Node<K,V> hashArray[]=new Node[10000];

/*	private int hashFunction(K input){
		int hashCode = 7;
		for (int i = 0; i < input.length(); i++) {
			hashCode= hashCode*31 + input.charAt(i);
		}
		System.out.println("hashCode :"+hashCode);
		return hashCode;
	}*/
	
	private int getHashArrayIndex(int hashCode){
		System.out.println("Array Index :"+Math.abs((hashCode % hashArray.length)));
		return Math.abs((hashCode % hashArray.length));
	}
	
	public boolean hashTableInsert(K key, V value){
		
		int arrayIndex=getHashArrayIndex(key.hashCode());
		Node<K,V> newNode = new Node<K, V>(key,value);
		newNode.next=null;
		
		if(hashArray[arrayIndex]==null){
			hashArray[arrayIndex]=newNode;
		}
		else{
			Node<K,V> tempNode=hashArray[arrayIndex];
			while(tempNode.next!=null){
				tempNode=tempNode.next;
			}
			tempNode.next=newNode;
		}
		return true;
	}
	public Object hashTableLookUp(K key){
		int arrayIndex=getHashArrayIndex(key.hashCode());
		Object result;
		Node<K,V> tempNode=hashArray[arrayIndex];
		while(!tempNode.key.equals(key)){
			tempNode=tempNode.next;
		}
		if(tempNode.key.equals(key)){
			result= tempNode.value;
		}
		else{
			result=null;
		}
		return result;
	}
}


