package javaProblems;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HuffmanCoding {

    HashMap<String ,Character> decoder;
    HashMap<Character , String> encoder;

    HuffmanCoding(String feeder) throws Exception{

       decoder = new HashMap<>();
       encoder = new HashMap<>();

       HashMap<Character , Integer> freq = new HashMap<>();

       // Making the frequency arr
       for(int i=0 ; i<feeder.length() ; i++){
            freq.put(feeder.charAt(i) , freq.getOrDefault(feeder.charAt(i) , 0)+1);
        }

       PriorityQueue<Node> pq = new PriorityQueue<>();

       for(Character temp : freq.keySet()){
           Integer frequency = freq.get(temp);
           Node node = new Node(temp , frequency);
           pq.add(node);
       }

       while(pq.size()!=1){

           Node right = pq.poll();
           Node left = pq.poll();

           //Combining
           Node newNode = new Node('\0' , right.value+left.value);

           newNode.right = right;
           newNode.left = left;

           pq.add(newNode);

       }

        Node combinedNode = pq.poll();
        combine(combinedNode , "");

    }


    private void combine(Node node , String path ){

        if(node == null) {
            return ;
        }

        if(node.right == null && node.left == null){
            encoder.put(node.ch , path);
            decoder.put(path,node.ch);
        }

        combine(node.left , path+"1");
        combine(node.right , path+"0");

    }

    public  String encode(String s){

        String res = "";

        for(int i=0 ; i<s.length() ; i++){

            res+=encoder.getOrDefault(s.charAt(i) , "0");

        }

        return res;

    }

    public String decode(String s){

        String res = "";

        String temp ="";

        for(int i = 0 ; i<s.length() ; i++){

            temp+=s.charAt(i);

            if(decoder.containsKey(temp)){
                res+=decoder.get(temp);
                temp = "";
            }

        }

        return res;
    }

    public static class Node  implements Comparable<Node>{

        Character ch;
        Node right;
        Node left;
        Integer value;

        Node(Character ch , Integer value){

            this.ch = ch;
            this.value = value;
        }


        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }

    }

}
