package DataStructures;
import java.util.Scanner;
public class LinkedList {
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head= null;
		Node<Integer> tail= null;
		
		while(data!=-1) {
			Node<Integer> newNode= new Node<>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=newNode;
			}
			data= s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+ " -> ");
			head=head.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		Node<Integer> head= takeInput();
		print(head);

		

	}

}
