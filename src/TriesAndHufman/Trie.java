package TriesAndHufman;
class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];
	int childCount;
	public TrieNode(char data) {
		this.data=data;
		this.isTerminal=false;
		this.children=new TrieNode[26]; 
		this.childCount=0;
	}
}
public class Trie {
    private TrieNode root;
    public Trie() {
    	root=new TrieNode('\0');  //initialized TrieNode with null
    }
    private void addHelper(TrieNode root,String word) {
    	if(word.length()==0) {
    		root.isTerminal=true;
    		return;
    	}
    	int childIndex=word.charAt(0)-'A';    //we are subtracting the first character of the word with a to find index corresponding to 26
    	TrieNode child=root.children[childIndex];  //now we created a new childNode and chechked at child index if character is present or not 
    	if(child==null) {    //null means character not present in the child array
    		child=new TrieNode(word.charAt(0));    //now we inserted the character at the child array
    		root.children[childIndex]=child;     //now at child index we inserted the child
    	    root.childCount++;
    	}
    	addHelper(child,word.substring(1));
    }
    public void add(String word) {
    	addHelper(root,word);
    }
    private boolean searchHelper(TrieNode root,String word) {
    	if(word.length()==0) {
    		return root.isTerminal;
    	}
    	int childIndex=word.charAt(0)-'A';
    	TrieNode child=root.children[childIndex];
    	if(child==null) {
    		return false;
    	}
    	return searchHelper(child,word.substring(1));
    	
    }
    public boolean search(String word) {
    	return searchHelper(root,word);
    }
    public void removeHelper(TrieNode root,String word) {
    	if(word.length()==0) {
    		root.isTerminal=false;
    		return;
    	}
    	int childIndex=word.charAt(0)-'A';
    	TrieNode child =root.children[childIndex];
    	if(child==null) {
    		return;
    	}
    	removeHelper(child,word.substring(1));
    	if(!child.isTerminal && child.childCount==0) {
    		root.children[childIndex]=null;
    		child.childCount--;
    	}
    	
    }
    public void remove(String word) {
    	removeHelper(root,word);
    }
}
