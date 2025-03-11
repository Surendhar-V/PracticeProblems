package javaProblems;

import java.util.*;

public class MinPlateforms {

    public static void main(String[] args) {

        int[] from = {900 , 1500 , 950 , 1100 , 940 , 1800};
        int[] to = {910 , 1200 , 1120 , 1130 , 1900 , 2000};

        findPlateforms(from , to);

    }

    public static void findPlateforms(int[] from , int[] to) {

        Arrays.sort(from);
        Arrays.sort(to);

        int counter =0;
        int i = 0 ;
        int j = 0;
        int max = 0;

        while(i < from.length){

            if(from[i] <= to[j]){
                // arrival
                counter++;
                i++;
            }else{
                counter--;
                j++;
            }
            max = Math.max(counter , max);
        }

        System.out.println(max);


    }


}