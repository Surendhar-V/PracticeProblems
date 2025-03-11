package javaProblems.HuffmanCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class huffmanCoding {

    public HashMap<Character , String > encoder;
    public HashMap<String , Character> decoder;

    public huffmanCoding(String feeder) throws Exception{

        HashMap<Character , Integer> fmap = new HashMap<>();

        for(int i= 0 ; i<feeder.length() ; i++){

            fmap.put(feeder.charAt(i) , fmap.getOrDefault(feeder.charAt(i) , 0)+1);

        }

        PriorityQueue<Node> pq = new PriorityQueue<>();
        Set<Map.Entry<Character , Integer>> entrySet = fmap.entrySet();

        for(Map.Entry<Character ,Integer> entry : entrySet){

            Node node = new Node(entry.getKey() , entry.getValue());
            pq.add(node);

        }

        while(pq.size() != 1){
            Node first = pq.poll();
            Node second = pq.poll();

            Node newNode = new Node('\0' , first.cost+second.cost);
            newNode.left =first;
            newNode.right = second;

            pq.add(newNode);
        }

        Node ft = pq.poll();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();


        this.initEncoderDecoder(ft , "");


    }

    // odf = Output So Far
    private void initEncoderDecoder(Node node , String osf ){
        if(node == null) {
            return;
        }

        if(node.left == null && node.right == null){
            this.encoder.put(node.data , osf);
            this.decoder.put(osf, node.data);
        }

        initEncoderDecoder(node.left , osf+"0");
        initEncoderDecoder(node.right , osf+"1");

    }

    public String encode(String source) {

        StringBuilder sb = new StringBuilder();

        for(int i=0 ; i<source.length() ; i++){
            sb.append(encoder.get(source.charAt(i)));
        }

        return sb.toString();

    }

    // Notice here, how the String is decoded.

    public String decode(String codedString){

        String ans ="";

        String key = "";
        for(int i = 0 ;i<codedString.length() ;i++){

            key = key + codedString.charAt(i);

            if(decoder.containsKey(key)){

                ans = ans + decoder.get(key);
                key = "";

            }
        }

        return ans;

    }



    private class Node implements Comparable<Node>{


        Character data;
        int cost ;
        Node left;
        Node right;

        public Node(Character data , int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;

        }

        @Override
        public int compareTo(Node other) {
            return this.cost - other.cost;
        }




    }
}
