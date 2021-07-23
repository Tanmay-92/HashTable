package HashAndBSt;

public class HashTableUC1 {

	public static void main(String[] args) {
		TableOperation<String, Integer> hashTable = new TableOperation<String, Integer>();
		String givensentence = "To be or not to be";

	
		String[] givensentenceArray = givensentence.toLowerCase().split(" ");

	
		for (String word : givensentenceArray) {
			Integer C = hashTable.get(word);

			if (C == null)
				C = 1;
			else
				C = C + 1;
			hashTable.add(word, C);
		}
		System.out.println(hashTable);

	}

}
