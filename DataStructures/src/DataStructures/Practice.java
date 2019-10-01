package DataStructures;
import java.util.Stack;
import java.util.Scanner;

public class Practice {
	public static boolean checkBalanced(String exp) {
		// Write your code here
        Stack<Character> s= new Stack<>();
        int i=0;
        while(i<exp.length()){
            while(i<exp.length() && exp.charAt(i)!=')' && exp.charAt(i)!=']' && exp.charAt(i)!='}'){
                if(exp.charAt(i)=='(' || exp.charAt(i)=='[' || exp.charAt(i)=='{'){
                    s.push(exp.charAt(i));
                    i++;
                }
                else
                    i++;
            }
            if(!s.isEmpty() && s.peek()=='(' && exp.charAt(i)==')' || s.peek()=='{' && exp.charAt(i)=='}' || s.peek()=='[' && exp.charAt(i)==']' ){
                s.pop();
                i++;
            }
            else
                i++;
        }
        if(s.isEmpty())
            return true;
        else
            return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		System.out.println(checkBalanced(input));
	}
}
