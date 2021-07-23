package HashAndBSt;

public class MyNode<T, V> {
		T key;
		V value;
		MyNode<T, V> next;

		public MyNode(T key, V value) {
			this.key = key;
			this.value = value;
			next = null;

		}

		public T getKey() {
			return key;
		}

		public void setKey(T key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public MyNode<T, V> getNext() {
			return next;
		}

		public void setNext(MyNode<T, V> next) {
			this.next = next;
		}
		
		
		    public String toString() {
		        StringBuilder Obj = new StringBuilder();
		        Obj.append("Node    ==" + "Word  ==").append(key).append(" No.of Times == ").append(value).append("   ");
		        if(next != null)
		            Obj.append(" \n").append(next);
		        return Obj.toString();
		    }

	}


