package javaProblems.Heap;

import java.util.ArrayList;

public class MinHeap {
    // Min Java.Heap

    private final ArrayList<Integer> arr;
    MinHeap(){
        arr = new ArrayList<>();
        // dummy value
        arr.add(0);
    }

    public void add(int value){

        arr.add(value);
        bottomUp();

    }
    public int remove(){

        int value = arr.get(1);
        arr.set(1 , arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        topDown();

        return value;

    }
    private void bottomUp(){

        int add_node = arr.size()-1;
        int parent_node = add_node/2;

        while(parent_node != 0 && arr.get(parent_node) > arr.get(add_node)){

            swap(parent_node , add_node);
            add_node = parent_node;
            parent_node = add_node/2;

        }

    }
    private void topDown(){

        int smallerItemPos = 0;
        int smallerItem = 0;
        int pos =1;

        while(pos < arr.size()/2) {

            smallerItem = Math.min(arr.get(pos * 2), arr.get((pos * 2) + 1));

            if (arr.get(pos * 2) == smallerItem) {
                smallerItemPos = pos * 2;
            } else {
                smallerItemPos = (pos * 2) + 1;
            }

            swap(pos, smallerItemPos);
            pos = smallerItemPos;

        }

    }
    private void swap(int i , int j ){

        int temp = arr.get(j);
        arr.set(j , arr.get(i));
        arr.set(i , temp);

    }

}
