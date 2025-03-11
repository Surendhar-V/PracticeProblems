package javaProblems;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {0,1,5,3,4};
        findmissingnumber(arr);


    }

    private static void findmissingnumber(int[] arr) {
        cyclicsort(arr);
        System.out.println(findnumber(arr));


    }
    private static void cyclicsort(int[] arr){
        int i =0;
        while(i<arr.length) {
            int correct = arr[i] ;
            if (arr[i]>=arr.length) {
                i++;
            }
            else if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }  else {
                i++;
            }
        }
    }

    private static int findnumber(int[] arr){
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }

        }
        return arr[arr.length-1]+1;
    }

    private static void swap(int[] arr , int first , int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]=temp;
    }
}


/*
            IMPORTANT NOTE:

            ->  Cyclic sort can be only applicable , if the number to be sorted is in sequence.
            ->  Cyclic sort can be applicable , if there is one missing number in the sequence.
            ->  Cyclic sort can not be applicable , if there is more than one missing number unless
                 it has duplicate elements at the count of the missing numbers.
                 for example , int[] arr = {1,2,3,4,3,2,7,8};   (result of sorting...)
                 ******The resulting array will not be in sorted order.*****


 */