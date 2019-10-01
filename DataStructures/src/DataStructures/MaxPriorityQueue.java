package DataStructures;
import java.util.ArrayList;

public class MaxPriorityQueue {
	
	ArrayList<Integer>heap;
	
	public MaxPriorityQueue() {
		heap = new ArrayList<>();
	}
	
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		return heap.isEmpty();
	}
	
	public void insert(int elem) {
		
		heap.add(elem);
		int childIndex=heap.size()-1;
		int parentIndex=(childIndex-1)/2;
		while(childIndex>0) {
			if(heap.get(childIndex)>heap.get(parentIndex)) {
				int temp=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex=parentIndex;
				parentIndex=(childIndex-1)/2;
			}
			else
				break;
		}
	}
	
	public int max() {
		if(heap.isEmpty())
			return Integer.MIN_VALUE;
		return heap.get(0);
	}
	
	public int removeMax() {
		
		if(heap.isEmpty())
			return Integer.MIN_VALUE;
		
		int temp=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parentIndex=0;
		int leftChidIndex=2*parentIndex+1;
		int rightChildIndex=2*parentIndex+2;
		while(leftChidIndex<heap.size()) {
			int maxIndex=parentIndex;
			if(heap.get(leftChidIndex)>heap.get(maxIndex)) {
				maxIndex=leftChidIndex;
			}
			if(rightChildIndex<heap.size() && heap.get(rightChildIndex)>heap.get(maxIndex)) {
				maxIndex=rightChildIndex;
			}
			if(parentIndex==maxIndex)
				break;
			else {
				int temp1=heap.get(parentIndex);
				heap.set(parentIndex, heap.get(maxIndex));
				heap.set(maxIndex,temp1);
				parentIndex=maxIndex;
				leftChidIndex=2*parentIndex+1;
				rightChildIndex=2*parentIndex+2;
			}
		}
		return temp;
	}

}
