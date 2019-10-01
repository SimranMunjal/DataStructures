package DataStructures;
import java.util.Scanner;
public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root:");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput();
		root.right=takeInput();
		return root;
	}
	
	public static BinaryTreeNode<Integer>takeInputLevelWise(){
		QueueUsingLL<BinaryTreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root:");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer>currNode=pendingNodes.dequeue();
//			try {
//				currNode=pendingNodes.dequeue();
//			}
//			catch(QueueEmptyException e) {
//			}
			System.out.println("Enter left child of:"+currNode.data);
			int leftChildData=s.nextInt();
			if(leftChildData!=-1) {
				BinaryTreeNode<Integer>leftChild= new BinaryTreeNode<Integer>(leftChildData);
				currNode.left=leftChild;
				pendingNodes.enqueue(leftChild);
			}
			System.out.println("Enter right child of:"+currNode.data);
			int rightChildData=s.nextInt();
			if(rightChildData!=-1) {
				BinaryTreeNode<Integer>rightChild= new BinaryTreeNode<Integer>(rightChildData);
				currNode.right=rightChild;
				pendingNodes.enqueue(rightChild);
			}
		}
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left != null) {
			System.out.print("L:"+root.left.data+",");
		}else {
			System.out.print("L:-1,");
		}
		if(root.right != null) {
			System.out.println("R:"+root.right.data);
		}else {
			System.out.println("R:-1");
		}
		print(root.left);
		print(root.right);
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		
        QueueUsingLL<BinaryTreeNode<Integer>>pendingNodes=new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()){
        BinaryTreeNode<Integer> currNode=pendingNodes.dequeue();
//        try{
//            currNode=pendingNodes.dequeue();
//        }  
//        catch(QueueEmptyException e){
//            
//        }
        System.out.print(currNode.data+":L:");
        if(currNode.left!=null){
            pendingNodes.enqueue(currNode.left);
            System.out.print(currNode.left.data+",R:");
        }
        else{
            System.out.print("-1,R:");
        }
        if(currNode.right!=null){
            pendingNodes.enqueue(currNode.right);
            System.out.print(currNode.right.data);
        }
        else{
            System.out.print("-1");
        }
        System.out.println();
        }
	}
	public static void main(String[] args) {
		//BinaryTreeNode<Integer>root=takeInput();
		//print(root);
		BinaryTreeNode<Integer>root=takeInputLevelWise();
		printLevelWise(root);
	}

}
