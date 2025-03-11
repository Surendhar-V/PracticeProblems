package javaProblems;

import java.util.ArrayList;

public class findLeader {

    public static void main(String[] args) {


        int[] arr = {16,17,4,3,5,2};
        System.out.println((find(arr)));

    }

    public static ArrayList<Integer> find(int[] arr){

        ArrayList<Integer> res=new ArrayList<>();
        int i=arr.length-1;
        while(i!=0){

            if(arr[i-1]>=arr[i]){
            i--;
            }
            else{
                res.add(arr[i]);
                i--;
            }

        }
        return res;
    }


}
