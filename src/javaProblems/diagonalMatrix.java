package javaProblems;

public class diagonalMatrix {

    public static void main(String[] args) {

//        {1,2,3,4,5},
//        {16,17,18,19,6},
//        {15,24,25,20,7},
//        {14,23,22,21,8},
//        {13,12,11,10,9},




    int[][] arr = {
            {1,2,4,7,11},
            {3,5,8,12,16},
            {6,9,13,17,20},
            {10,14,18,21,23},
            {15,19,22,24,25},
    };


    printdiagonal(arr);


    }

    public static void printdiagonal(int[][] arr){

        for(int k = 0; k <arr[0].length; k++){

            int i=0;
            int l=k;
            int count=0;
            while(count <=k){
                count++;
                System.out.print(arr[i][l]+"  ");
                i++;
                l--;
            }

        }

        for(int k = 1 ; k <arr.length; k++){

            int i=k;
            int l=arr.length-1;

            while(i<=arr.length-1){



                print(arr[i][l]);
                i++;
                l--;

            }

        }



    }

    public static void print(int a){
        System.out.print(a + "  ");

    }

}