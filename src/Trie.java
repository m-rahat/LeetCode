//implementation of the TRIE data structure

public class Trie {
	
}// Trie

class TrieNode {
	
	char c;
	boolean isWord;
	TrieNode[] children;
	
	TrieNode(char c){
		this.c = c;
		isWord = false;
		children = new TrieNode[26];
	}
	
	public String toString() {
		return Character.toString(c);
	}
	
}
