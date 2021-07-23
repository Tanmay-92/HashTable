package HashAndBSt;

public class TableOperation<T,V> {

		MyNode head;
		MyNode tail;

		
		public V get(T word) {
			MyNode<T, V> myNode = FindNode(word);
			return (myNode == null) ? null : myNode.getValue();
		}

		
		public MyNode<T, V> FindNode(T word) {
			MyNode<T, V> currentNode = head;
			int position = 0;
			while (currentNode != null) {
				position++;
				if (currentNode.getKey().equals(word)) {
					return currentNode;
				}
				currentNode = currentNode.getNext();
			}
			return currentNode;
		}

		
		public void add(T key, V value) {
			MyNode<T, V> myNode = FindNode(key);
			if (myNode == null) {
				myNode = new MyNode<>(key, value);
				this.append(myNode);
			} else
				myNode.setValue(value);

		}
	

		private void append(MyNode<T, V> myNode) {
			if (this.head == null)
				this.head = myNode;
			if (this.tail == null)
				this.tail = myNode;
			else {
				this.tail.setNext(myNode);
				this.tail = myNode;
			}
		}

		public String toString() {
			return "MyLinkedListNodes{" + head + '}';
		}

	}




