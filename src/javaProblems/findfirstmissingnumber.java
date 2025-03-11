package javaProblems;

public class findfirstmissingnumber{


    public static void main(String[] args){


        System.out.println(firstMissingPositive(new int[]  {1}));




    }


    public static  int firstMissingPositive(int[] arr) {


        //making the negative number or the greater than the length to the length of the array.

        for(int i = 0;i <arr.length;i++){

            if(arr[i] <= 0 || arr[i] >arr.length){
                arr[i] = arr.length;
            }

        }

        for(int i = 0;i<arr.length;i++){

            if(arr[Math.abs(arr[i])-1] >0){
                arr[Math.abs(arr[i])-1]*=-1;
            }
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                return i+1;
            }

        }

        if(arr.length == 1 && arr[arr.length-1]==1){
            return arr.length+1;
        }
        if(Math.abs(arr[arr.length-1])==arr.length){
            return arr.length;
        }

        return 0;



    }
}