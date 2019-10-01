package DataStructures;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueUse {
	
	public static void main(String[] args) {
//		
//		MinPriorityQueue pq = new MinPriorityQueue();
//		pq.insert(3);
//		pq.insert(2);
//		int a = pq.min();
//		System.out.println(a);
		
//		MaxPriorityQueue mpq = new MaxPriorityQueue();
//		for(int i=0;i<5;i++) {
//			mpq.insert(i);
//		}
//		mpq.removeMax();
//		int x= mpq.max();
//		System.out.println(x);
		
		PriorityQueue<Integer> a = new PriorityQueue<>(Collections.reverseOrder());
		a.add(4);
		a.add(2);
		a.add(6);
		int b = a.remove();
		System.out.println(b);
	}
	

}
