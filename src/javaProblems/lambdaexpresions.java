package javaProblems;

import java.util.ArrayList;
import java.util.List;

public class lambdaexpresions {

    public static void main(String[] args) {


        List<Integer> ls=new ArrayList<>();

        for(int i =0;i<=9;i++){
            ls.add(i);
        }

        ls.forEach((n)-> System.out.print(n));


    }

}
