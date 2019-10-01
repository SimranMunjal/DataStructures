package DataStructures;

	public class QueueUsingLL<T> {
	private Node<T> head;
	private Node<T> tail;
	int count;
	
	public QueueUsingLL() {
		this.head=null;
		this.tail=null;
		this.count=0;
	}
	
	public void enqueue(T element) {
		Node<T> newNode= new Node<T>(element);
		if(head==null) {
			newNode.next=head;
			head=newNode;
			tail=newNode;
			count++;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			count++;
		}
	}
	
	public T dequeue() {
		if(isEmpty())
			return null;
		else {
			T data=head.data;
			head=head.next;
			count--;
			return data;
		}
	}
	public T front() {
		if(head==null) {
			System.out.print("Queue is Empty");
			return null;
		}
		else
			return head.data;
	}
	
	public int size() {
		return count;
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		
		QueueUsingLL<Integer> q= new QueueUsingLL<>();
		
		q.enqueue(4);
		q.enqueue(2);
		q.enqueue(7);
		q.enqueue(8);
		while(!q.isEmpty()) {
			int element=q.dequeue();
			System.out.println(element);
			System.out.println(q.size());
		}
	
	}
}

