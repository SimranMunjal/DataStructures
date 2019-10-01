package DataStructures;

public class Trie {
	
	TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	private void insertWordHelper(TrieNode root, String word) {
		
		if(word.length()==0) {
			root.isTerminal=true;
			return;
		}
		 
		char currChar = word.charAt(0);
		TrieNode childNode;
		if(root.children.containsKey(currChar)) {
			childNode = root.children.get(currChar);
		}
		else {
			childNode = new TrieNode(currChar);
			root.children.put(currChar, childNode);
		}
		insertWordHelper(childNode, word.substring(1));
	}
	
	public void insertWord(String word) {
		insertWordHelper(root, word);
	}
	
	public boolean searchWord(String word) {
		
		TrieNode curr = root;
		for(int i=0;i<word.length();i++){
			char currChar = word.charAt(i);
			if(curr.children.containsKey(currChar)) {
				TrieNode currChild = curr.children.get(currChar);
				curr=currChild;
			}
			else {
				return false;
			}
		}
		return curr.isTerminal;
	}
	
	private void deleteWordHelper(TrieNode root, String word) {
		
		if(word.length()==0) {
			root.isTerminal=false;
			return;
		}
		
		char currChar = word.charAt(0);
		TrieNode childNode;
		if(root.children.containsKey(currChar)) {
			childNode = root.children.get(currChar);
			deleteWordHelper(childNode, word.substring(1));
			if(!childNode.isTerminal && childNode.children.size()==0) {
				root.children.remove(currChar);
			}
		}
		else {
			return;
		}
	}
	
	public void deleteWord(String word) {
		deleteWordHelper(root, word);
	}
	

}
