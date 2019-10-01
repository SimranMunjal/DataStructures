package DataStructures;

public class TrieUse {
	
	public static void main(String[] args) {
		
//		Trie t = new Trie();
//		t.insertWord("abc");
//		t.insertWord("hello");
//		t.insertWord("hell");
//		System.out.println(t.searchWord("hello"));
//		t.deleteWord("hell");
//		System.out.println(t.searchWord("hell"));
		
		TrieUsingArray a = new TrieUsingArray();
		a.add("hello");
		a.add("hell");
		a.remove("hell");
		System.out.println(a.search("hello"));
		
	}
}
