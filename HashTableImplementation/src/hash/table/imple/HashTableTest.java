package hash.table.imple;

public class HashTableTest {
	public static void main(String agrs[]){
		HashTable<Integer, Integer> hashTable  = new HashTable<Integer, Integer>();
		hashTable.hashTableInsert(1, 2716);
		hashTable.hashTableInsert(2, 14);
		hashTable.hashTableInsert(5, 17);
		hashTable.hashTableInsert(8, 36);
		System.out.println(hashTable.hashTableLookUp(1));
	}

}
