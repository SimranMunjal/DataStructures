package DataStructures;

public class StackUsingLL<T> {
	private Node<T> head;
	private int count;
	
	public StackUsingLL() {
		this.head=null;
		this.count=0;
	}
	public void push(T element) {
		Node<T>newNode=new Node<T>(element);
		newNode.next=head;
		head=newNode;
		count++;
		
	}
	public T pop() throws StackEmptyException {
		if(isempty()) {
			throw new StackEmptyException();
		}
		T data =head.data;
		head=head.next;
		count--;
		return data;
		
	}
	public T top() throws StackEmptyException {
		if(head==null) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	public int size() {
		return count;
	}
	public boolean isempty() {
		if(size()==0) {
			return true;
		}
		else
			return false;
	}

}
