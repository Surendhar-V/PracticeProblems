package javaProblems.Trie;

public class Main {


    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("help");
        trie.insert("help");
        System.out.println(trie.search("help"));
        System.out.println(trie.startsWith("hel"));
        System.out.println(trie.search("hel"));
        trie.insert("surendhar");
        trie.insert("suren");
        System.out.println(trie.search("suren"));
        System.out.println(trie.startsWith("sure"));
    }


}