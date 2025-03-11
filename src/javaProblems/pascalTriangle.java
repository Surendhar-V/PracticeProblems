package javaProblems;

import java.util.Arrays;

public class pascalTriangle{

    public static void main(String[] args){

        pascalTriangle(6);

    }


    public static void pascalTriangle(int row){

        int dummy=(row*(row+1))/2;
        int[] arr=new int[dummy];

        Arrays.fill(arr,1);
        int i=0;
        int left =1;
        int right=left+1;
        int num=2;
        while(true) {

            if(num==row){
                break;
            }

            arr[num*(num+1)/2 +i+1]=arr[left] +arr[right];
            i++;
            left++;
            right++;



            if(right == (num*(num+1)/2)){
                left=((num*(num+1))/2);
                right=left+1;
                num++;

                i=0;
            }


        }

        print(arr,row);

    }

    public static void print(int[] arr,int row){

        System.out.println(Arrays.toString(arr));
        int k=0;
        int num=row;
        for(int p=1;p<num;p++){

//            for(int l=1;l<-p+num;l++){
//                System.out.print(" ");
//            }
            for(int q=1;q<p;q++,k++){

                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }

    }

}


