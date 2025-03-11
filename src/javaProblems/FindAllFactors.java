package javaProblems;

import java.util.ArrayList;

public class FindAllFactors {

    public static void main(String[] args){

        int num= 100;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1 ; i<=Math.sqrt(num);i+=1){
            if(num%i == 0){

                if(num/i == i){
                    System.out.println(i+" ");
                }else {
                    System.out.println(i+" ");
                    list.add(num/i);
                }

            }
        }

        list.sort((a,b)-> a-b);

        list.forEach(it-> System.out.println(it+" "));


    }

}
