package DataStructures;

public class HashmapNode<K,V> {
	K key;
	V value;
	HashmapNode<K, V>next;
	
	public HashmapNode(K key, V value){
		this.key=key;
		this.value=value;
	}

}
