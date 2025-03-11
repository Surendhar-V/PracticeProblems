package javaProblems;

import java.util.*;

class LRU_implementation {

    HashMap<Integer , Node> map;
    int k;
    Node head;
    Node tail;

    public LRU_implementation(int capacity) {

        map = new HashMap();
        k = capacity;

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;

    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }else{
            Node oldNode = map.get(key);
            remove(map.get(key));
            put(oldNode.key , oldNode.value);
            return oldNode.value;
        }
    }

    public void put(int key, int value) {

        if(map.containsKey(key)){
            remove(map.get(key));
            put(key , value);
        }else{

            if(map.size() == k){
                removeLRU();
            }

            Node prev = head;
            Node nxt = prev.next;
            Node cur = new Node(key , value);

            prev.next = cur;
            cur.prev = prev;
            nxt.prev = cur;
            cur.next = nxt;

            map.put(key, cur);

        }

    }

    private void remove(Node node){

        Node cur = map.get(node.key);
        Node prev = cur.prev;
        Node nxt = cur.next;

        prev.next = nxt;
        nxt.prev = prev;

        cur.next = null;
        cur.prev = null;

        map.remove(node.key);

    }

    private void removeLRU(){

        Node cur = tail.prev;
        Node prev = cur.prev;
        Node nxt = cur.next;

        prev.next = nxt;
        nxt.prev = prev;

        map.remove(cur.key);

    }

    class Node{
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key , int value){
            this.key = key;
            this.value = value;
            prev = null;
            next = null;
        }

    }

}