package DataStructures;
import java.util.Scanner;
import java.util.ArrayList;

public class TreeUse {
	
	public static TreeNode<Integer> takeInputLevelWise(){
		QueueUsingLL<TreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
		Scanner s= new Scanner(System.in);
		int rootData= s.nextInt();
		TreeNode<Integer>root=new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()){
            TreeNode<Integer> currentNode;
            //try {
                currentNode = pendingNodes.dequeue();
                int numChild = s.nextInt();
                for(int i = 0 ; i < numChild; i++){
                    int currentChild = s.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
                    pendingNodes.enqueue(childNode);
                    currentNode.children.add(childNode);
                    
                }
            //} catch (QueueEmptyException e) {
            //}
        }
        return root;
    }
    
    
    public static void main(String[] args) {
        TreeNode<Integer> root =  takeInputLevelWise();
		
	}
	

}
