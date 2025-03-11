package javaProblems;

import java.util.*;
public class mergesortInPlace{

    public static void main(String[] args){

        int[] arr = {5,4,3,2,1};
        mergesortInplace(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }



    private static void mergesortInplace(int[] arr , int s, int e){



        if(s==e){
            return;
        }

        int mid = (s+e)/2;

        mergesortInplace(arr,s,mid);
        mergesortInplace(arr,mid+1,e);



        mergeInplace(arr,s,mid,e);


    }



    private static void mergeInplace(int[] arr , int s,int mid , int e){


        int i = s;
        int j = mid+1;
        int k = s;

        int[] newarr=new int[arr.length];


        while(j<=e && i<=mid){


            if(arr[i] <= arr[j]){
                newarr[k]=arr[i];
                i++;
            }
            else{
                newarr[k]=arr[j];
                j++;
            }
            k++;


        }
        while(i<=mid){

            newarr[k]=arr[i];
            i++;
            k++;
        }

        while(j<=e){

            newarr[k]=arr[j];
            j++;
            k++;

        }


        if (e + 1 - s >= 0) System.arraycopy(newarr, s, arr, s, e + 1 - s);



    }




}