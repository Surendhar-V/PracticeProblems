package javaProblems.Trie;

public class Trie {

    private TrieNode root = null;

    Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;

        for(int i= 0 ; i<word.length() ; i++){
            if(!node.containsKey(word.charAt(i))){
                node.put(word.charAt(i) , new TrieNode());
                node.data = word.charAt(i);
            }
            node = node.get(word.charAt(i));
        }
        node.setEnd();
    }

    public boolean search(String word){
        TrieNode node = root;
        for(int i =0 ; i<word.length();i++){
            if(!node.containsKey(word.charAt(i))){
                return false;
            }
            node = node.get(word.charAt(i));
        }
        return node.isEnd();
    }

    public boolean startsWith(String prefix){
        TrieNode node = root;

        for(int i = 0; i<prefix.length();i++){
            if(!node.containsKey(prefix.charAt(i))){
                return false;
            }
            node = node.get(prefix.charAt(i));
        }
        return true;
    }

    private static class TrieNode{
        char data;
        TrieNode[] child;
        boolean flag  ;
        TrieNode(){

            this.data = ' ';
            this.child = new TrieNode[26];
            this.flag = false;

        }

        public boolean containsKey(char ch){
            return child[ch-'a'] != null;
        }
        public void put(char ch , TrieNode node){
            child[ch-'a'] = node;
        }
        public void setEnd(){
            this.flag = true;
        }
        public TrieNode get(char ch){
            return child[ch-'a'];
        }
        public boolean isEnd(){
            return flag;
        }
    }

}