package DataStructures;
import java.util.Stack;
import java.util.Scanner;
public class StackUse {

	public static void main(String[] args) throws StackEmptyException {
		StackUsingLL<Integer> s=new StackUsingLL<>();
		s.push(1);
		s.push(3);
		s.push(5);
		System.out.println(s.size());
		System.out.println(s.top());
		while(!s.isempty()) {
			s.pop();
			System.out.println(s.top());
		}
		
		StackUsingArray a= new StackUsingArray(5);
		a.push(1);
		a.push(2);
		a.push(3);
		System.out.println(a.top());
		while(!a.isEmpty()) {
			System.out.println(a.pop());
		}
		System.out.println(a.top());
		
		Stack<Integer> w= new Stack<>();
//		w.add(3);
//		w.add(5);
//		w.pop();
//		System.out.println(w.size());
//		System.out.println(w.peek());
	}
	

}
