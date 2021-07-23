package HashAndBSt;

public class MapNode <T, V> {

	
	
	T key;
	V value;
	MapNode<T, V> next;

	public MapNode(T key, V value) {
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

	public MapNode<T, V> getNext() {
		return next;
	}

	public void setNext(MapNode<T, V> next) {
		this.next = next;
	}
	
	
	    public String toString() {
	        StringBuilder nodeString = new StringBuilder();
	        nodeString.append("Node(" + "Key=").append(key).append(" Value=").append(value).append(")");
	        if(next != null)
	            nodeString.append(" \n").append(next);
	        return nodeString.toString();
	    }
}
