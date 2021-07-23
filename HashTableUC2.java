package HashAndBSt;

public class HashTableUC2 {

	
	public static void main(String[] args) {
		TableOperation<String, Integer> hashTable = new TableOperation<String, Integer>();
		String givensentence = "Paranoids are not paranoid because they are paranoid but " +
                          "because they keep putting themselves deliberately into paranoid "+
				          "avoidable situations";

		
		String[] givensentenceArray = givensentence.toLowerCase().split(" ");

		
		for (String word : givensentenceArray) {
			Integer count = hashTable.get(word);

			if (count == null)
				count = 1;
			else
				count = count + 1;
			hashTable.add(word, count);
		}
		System.out.println(hashTable);

	}

}
