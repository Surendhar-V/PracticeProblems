package javaProblems;

/*

INTUITION - Here we can make use of cyclic sort . Because its from 1 to n .
            After cyclic sort the number which are not present are filled by the duplicate values.



NOTED - IF THERE IS TWO DUPLICATE ELEMENTS , WE NEED TWO ELEMENTS ABSENT FROM THE ORIGINAL ARRAY , SO THAT WE CAN USE CYCLIC SORT.

 */
public class FindduplicateNumbers {
    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};
        find(arr);
    }

    private static void find(int[] arr) {

        //cyclic sort
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }

        //finding duplicate numbers.
        //this algo will find all duplicates. If there one  , it will show one duplicate


        for(int k =0;k<arr.length;k++){
            if(arr[k] != k+1){
                System.out.println(arr[k]);
            }
        }



    }
    private static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}
