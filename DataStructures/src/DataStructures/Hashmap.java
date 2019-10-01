package DataStructures;
import java.util.ArrayList;

public class Hashmap<K,V> {
	ArrayList<HashmapNode<K, V>> buckets;
	int size;
	int numBuckets;
	
	public Hashmap() {
		numBuckets=20;
		buckets= new ArrayList<>();
		for(int i=0;i<numBuckets;i++) {
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashCode= key.hashCode();
		return hashCode%numBuckets;
	}
	
	public double loadFactor() {
		return (1.0*size)/numBuckets;
	}
	
	public void rehash() {
		System.out.println("Rehashing");
		ArrayList<HashmapNode<K, V>> temp= buckets;
		buckets= new ArrayList<>();
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		size=0;
		numBuckets*=2;
		for(int i=0;i<temp.size();i++) {
			HashmapNode<K, V> head= temp.get(i);
			while(head!=null) {
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head=head.next;
			}
		}
	}
	
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		HashmapNode<K, V> head= buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		size++;
		head= buckets.get(bucketIndex);
		HashmapNode<K, V>newElement=new HashmapNode<>(key, value);
		newElement.next=head;
		buckets.set(bucketIndex, newElement);
		double loadFactor = (1.0*size)/numBuckets;
		if(loadFactor>0.7) {
			rehash();
		}
	}
	
	public int size() {
		return size;
	}
	
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		HashmapNode<K, V> head= buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public V removeKey(K key) {
		int bucketIndex = getBucketIndex(key);
		HashmapNode<K, V> head= buckets.get(bucketIndex);
		HashmapNode<K, V> prev= null;
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev==null) {
					head=head.next;
				}
				else {
					prev.next=head.next;
				}
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		return null;
		
	}
	
	
	

}
