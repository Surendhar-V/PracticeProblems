package javaProblems;

import java.util.Arrays;

public class array_permutations {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(buildArray(new int[]{0, 2, 1, 5, 3, 4})));
    }

    public static int[] buildArray(int[] arr) {


        /*

        we can store the value in the number by the following

        a+b*n

        (a+b*n)/n = b
        (a+b*n)%n = a

        By this trick we are solving the problem

        where a = arr[i];
              b = arr[arr[i]];

         */
        int n=arr.length;
        for(int i =0;i<arr.length;i++){

            int a = arr[i];
            int b = arr[a];
            arr[i]=a+((b%n)*n);


        }

        for(int i=0;i<arr.length;i++){

            arr[i]=arr[i]/n;
        }

        return arr;




    }


}
