package javaProblems;

import java.util.HashMap;
import java.util.Map;

public class LFU {

    final int capacity;
    int curSize;
    int minFrequency;
    Map<Integer, DLLNode> cache;
    Map<Integer, DoubleLinkedList> frequencyMap;

    public LFU(int capacity) {

        this.capacity = capacity;
        this.curSize = 0;
        this.minFrequency = 0;

        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();

    }

    public int get(int key) {

        if (capacity == 0) {
            return -1;
        }

        DLLNode node = cache.get(key);

        if (node == null) {
            return -1;
        }

        updateNode(node);

        return node.val;

    }


    public void put(int key, int value) {

        if (capacity == 0) {
            return;
        }

        if (cache.containsKey(key)) {

            DLLNode curNode = cache.get(key);
            curNode.val = value;
            updateNode(curNode);

        } else {

            curSize++;

            if (curSize > capacity) {
                DoubleLinkedList minFreqList = frequencyMap.get(minFrequency);
                cache.remove(minFreqList.tail.prev.key);
                minFreqList.removeNode(minFreqList.tail.prev);
                curSize--;
            }

            minFrequency = 1;
            DLLNode newNode = new DLLNode(key, value);
            DoubleLinkedList curList = frequencyMap.getOrDefault(1, new DoubleLinkedList());
            curList.addNode(newNode);
            frequencyMap.put(1, curList);
            cache.put(key, newNode);

        }

    }

    private void updateNode(DLLNode node) {

        int curFreq = node.frequency;
        DoubleLinkedList list = frequencyMap.get(curFreq);
        list.removeNode(node);

        if (curFreq == minFrequency && list.size() == 0) {
            minFrequency++;
        }

        node.frequency++;

        DoubleLinkedList newList = frequencyMap.getOrDefault(node.frequency, new DoubleLinkedList());
        newList.addNode(node);
        frequencyMap.put(node.frequency, newList);

    }


    public class DLLNode {

        int key;
        int val;
        DLLNode next;
        DLLNode prev;
        int frequency;

        public DLLNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.frequency = 1;
        }

    }

    public class DoubleLinkedList {

        int listSize;
        DLLNode head;
        DLLNode tail;

        public DoubleLinkedList() {
            this.listSize = 0;
            this.head = new DLLNode(0, 0);
            this.tail = new DLLNode(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        public void addNode(DLLNode node) {

            DLLNode nextNode = head.next;
            node.next = nextNode;
            node.prev = head;
            head.next = node;
            nextNode.prev = node;
            listSize++;

        }

        public void removeNode(DLLNode node) {

            DLLNode prevNode = node.prev;
            DLLNode nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            listSize--;

        }

        public int size() {
            return listSize;
        }

    }

}