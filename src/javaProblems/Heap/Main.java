package javaProblems.Heap;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MaxHeap heap = new MaxHeap();

        heap.add(10);
        heap.add(8);
        heap.add(9);
        heap.add(6);
        heap.add(5);
        heap.add(4);
        heap.add(3);
        heap.add(2);
        heap.add(11);

//    heap.print();
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());

        MaxHeap heap1 = new MaxHeap(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(heap1.sort());


        MinHeap heap2 = new MinHeap();

        heap2.add(10);
        heap2.add(8);
        heap2.add(9);
        heap2.add(6);
        heap2.add(5);
        heap2.add(4);
        heap2.add(3);
        heap2.add(2);
        heap2.add(2);
        heap2.add(11);

        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());
        System.out.println(heap2.remove());


    }
}