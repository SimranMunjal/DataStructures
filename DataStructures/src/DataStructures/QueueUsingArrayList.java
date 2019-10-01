package DataStructures;
import java.util.ArrayList;
public class QueueUsingArrayList<T> {
	ArrayList<T> list;
	int fIndex;
	
	public QueueUsingArrayList() {
		list = new ArrayList<>();
		fIndex = 0;
	}
	
	public void enqueue(T element) {
		list.add(element);
	}
	
	public T dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		T element = list.get(fIndex);
		fIndex++;
		return element;
	}
	public T front() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return null;
		}
		return list.get(fIndex);
	}
	public int size() {
		return list.size()-fIndex;
	}
	public boolean isEmpty() {
		if(size() ==0) {
			return true;
		}
		return false;
	}
}



