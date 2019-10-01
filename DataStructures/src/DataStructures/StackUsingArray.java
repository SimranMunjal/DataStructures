package DataStructures;

public class StackUsingArray {
	private int[] arr;
	private int nextIndex;
	
	public StackUsingArray(int maxSize){
		arr = new int[maxSize];
		nextIndex=0;
	}
	
	public void push(int element) {
		arr[nextIndex]=element;
		nextIndex++;
	}
	
	public int pop() {
		if(isEmpty())
			return -1;
		int data=arr[nextIndex-1];
		nextIndex--;
		return data;
	}
	
	public int top() {
		if(isEmpty())
			return -1;
		int data=arr[nextIndex-1];
		return data;
	}
	
	public boolean isEmpty() {
		if(size()==0)
			return true;
		return false;
	}
	
	public int size() {
		return nextIndex;
	}

}
