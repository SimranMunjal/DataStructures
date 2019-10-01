package DataStructures;

class TrieNodeA{
	
	char data;
	TrieNodeA children[];
	boolean isTerminating;
	int childCount;
	
	public TrieNodeA(char data){
		this.data=data;
		isTerminating=false;
		children = new TrieNodeA[26];
		childCount=0;
	}
}

public class TrieUsingArray {
	
	private TrieNodeA root;
	
	public TrieUsingArray() {
		root = new TrieNodeA('\0');
	}
	
	public void add(TrieNodeA root, String word) {
		if(word.length()==0) {
			root.isTerminating=true;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNodeA child = root.children[childIndex];
		if(child==null) {
			child = new TrieNodeA(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
		
	}
	public void add(String word) {
		add(root,word);
	}
	
	public boolean search(TrieNodeA root, String word) {
		if(word.length()==0) {
			return root.isTerminating;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNodeA child = root.children[childIndex];
		if(child==null) {
			return false;
		}
		return search(child, word.substring(1));
	}
	
	public boolean search(String word) {
		
		return search(root,word);
	}
	
	public void remove(TrieNodeA root, String word) {
		
		if(word.length()==0) {
			root.isTerminating=false;
			return;
		}
		
		int childIndex = word.charAt(0) - 'a';
		TrieNodeA child = root.children[childIndex];
		if(child==null) {
			return;
		}
		remove(child,word.substring(1));
		if(!child.isTerminating && child.childCount==0) {
			root.children[childIndex]=null;
			child=null;
			root.childCount--;
		}
	}
	
	public void remove(String word) {
		
		remove(root,word);
	}
}
