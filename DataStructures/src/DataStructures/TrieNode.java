package DataStructures;

import java.util.HashMap;

public class TrieNode {
	char data;
	HashMap<Character,TrieNode> children;
	boolean isTerminal;
	
	public TrieNode(char data) {
		this.data=data;
		this.children = new HashMap<>();
		this.isTerminal=false;
	}
}
