package DataStructures;

public class StackUsingTwoQueues<T> {
	QueueUsingArrayList<T> q1;
	QueueUsingArrayList<T> q2;
	
	public StackUsingTwoQueues() {
		q1=new QueueUsingArrayList<>();
		q2=new QueueUsingArrayList<>();
		
	}
	
	public void push(T element) {
		q1.enqueue(element);
	}
	
	public T pop() {
		while(q1.size()!=1) {
			q2.enqueue(q1.dequeue());
		}
		T data=q1.dequeue();
		while(q2.size()!=0) {
			q1.enqueue(q2.dequeue());
		}
		return data;
	}
	
	public int size() {
		return q1.size();
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		return false;
	}
	
	public T top() {
		if(isEmpty())
			return null;
		else {
			while(q1.size()!=1) {
				q2.enqueue(q1.dequeue());
			}
			T data=q1.front();
			q2.enqueue(q1.dequeue());
			while(q2.size()!=0) {
				q1.enqueue(q2.dequeue());
			}
			return data;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		StackUsingTwoQueues<Integer> q=new StackUsingTwoQueues<>();
		q.push(4);
		q.push(5);
		q.push(1);
		System.out.println(q.top());
		System.out.println(q.pop());
		System.out.println(q.top());
		while(!q.isEmpty()) {
			System.out.println(q.pop());
		}
		System.out.println(q.top());
	}
	
	

}
