package HashAndBSt;

import java.util.ArrayList;

public class TableOperationUC2<T, V> {


		MapNode head;
		MapNode tail;
		private int numOfBuckets = 0;
		ArrayList<MapNode<T, V>> myBucketArray;
		
		

		public  TableOperationUC2() {
			this.numOfBuckets = 10;
			this.myBucketArray = new ArrayList<>();
			for (int i = 0; i < numOfBuckets; i++)
				this.myBucketArray.add(null);
		}

		public V get(T word) {
			int index = this.getBucketIndex(word);
			if (this.myBucketArray.get(index) == null)
				return null;
			MapNode<T, V> myNode = searchNode(word);
			return (myNode == null) ? null : myNode.getValue();
		}

		
		public MapNode<T, V> searchNode(T word) {
			MapNode<T, V> currentNode = head;
			int pos = 0;
			while (currentNode != null) {
				pos++;
				if (currentNode.getKey().equals(word)) {
					return currentNode;
				}
				currentNode = currentNode.getNext();
			}
			return currentNode;
		}

		public void add(T key, V value) {
			int index = this.getBucketIndex(key);
			MapNode<T, V> Node1 = this.myBucketArray.get(index);
			if (Node1 == null) {
				Node1 = new MapNode<>(key, value);
				this.myBucketArray.set(index, Node1);
			}
			Node1 = searchNode(key);
			if (Node1 == null) {
				Node1 = new MapNode<>(key, value);
				this.append(Node1);
			} else
				Node1.setValue(value);

		}


		private void append(MapNode<T, V> Node1) {
			if (this.head == null)
				this.head = Node1;
			if (this.tail == null)
				this.tail = Node1;
			else {
				this.tail.setNext(Node1);
				this.tail = Node1;
			}
		}

		public int getBucketIndex(T word) {
			int hashCode = Math.abs(word.hashCode());
			int index = hashCode % numOfBuckets;
			return index;
		}

		
		public String toString() {
			return "LinkedList  Nodes :("  + head + ')';
		}
}
