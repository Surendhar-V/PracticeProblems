package javaProblems.Heap;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class MaxHeap {
    List<Integer> arr;
    MaxHeap(){

        arr = new ArrayList<>();

    }

    MaxHeap(List<Integer> brr){
        arr = new ArrayList<>();
        for(int a : brr){
         add(a);
        }
    }

    public List<Integer> sort(){

        List<Integer> newList;

        newList = IntStream.range(0 , arr.size()).boxed().map(it -> remove()).toList();

        return newList;

    }
    private int getLeft(int i ){
        return (2*i)+1;
    }
    private int getRight(int i){
        return (2*i)+2;
    }
    private int getNode(int i){
        return (i-1)/2;
    }

    public void add(int value){

        arr.add(value);
        balanceBottomUp(arr ,arr.size()-1);

    }
    public int remove(){

        int temp = arr.get(0);
        arr.set(0 , arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        balanceTopDown(0);

        return temp;
        }
    private void balanceTopDown(int i){

        if(i>=arr.size()-2 ){
            return;
        }

        int minIdx = i;
        int left = getLeft(i);
        int right = getRight(i);

        if(left >=arr.size() || right >=arr.size()){
            return;
        }

        if(arr.get(left) < arr.get(right)){
            minIdx = right;
        }else{
            minIdx = left;
        }

        swap(arr , i , minIdx);
        balanceTopDown(minIdx);

    }
    private void balanceBottomUp(List<Integer> arr , int i){

        if(i == 0){
            return;
        }

        if(arr.get(i) > arr.get(getNode(i))) {
            swap(arr , i , getNode(i));
            balanceBottomUp( arr , getNode(i) );
        }

    }

    public void print(){
        System.out.println(arr);
    }
    private void swap(List<Integer> arr , int i , int j ){

        int temp = arr.get(i);
        arr.set(i , arr.get(j));
        arr.set(j , temp);

    }



}