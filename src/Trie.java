//implementation of the TRIE data structure

public class Trie {

	public TrieNode root;

	Trie() {
		root = new TrieNode('\0');
	}

	public void insert(String word) {
		TrieNode curr = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (curr.children[c - 'a'] == null)
				curr.children[c - 'a'] = new TrieNode(c);
			curr = curr.children[c - 'a'];
		}
		curr.isWord = true;
	}

	public boolean hasWord(String word) {
		TrieNode node = this.getNode(word);
		if (node == null)
			return false;
		if (node.isWord == true)
			return true;
		else
			return false;
	}

	public boolean search(String word) {
		TrieNode node = this.getNode(word);
		if (node == null)
			return false;
		if (node.isWord == true)
			return true;
		else
			return false;
	}

	public boolean startsWith(String prefix) {
		TrieNode node = this.getNode(prefix);
		if (node == null)
			return false;
		else
			return true;
	}

	public TrieNode getNode(String word) {
		TrieNode curr = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (curr.children[c - 'a'] == null)
				return null;
			curr = curr.children[c - 'a'];
		}
		return curr;
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		trie.insert("applepie");
		trie.insert("amazon");

		System.out.println(trie.hasWord("amazon"));

	}

}// Trie

class TrieNode {
	char c;
	boolean isWord;
	TrieNode[] children;

	TrieNode(char c) {
		this.c = c;
		isWord = false;
		children = new TrieNode[26];
	}

	public String toString() {
		return Character.toString(c);
	}
}