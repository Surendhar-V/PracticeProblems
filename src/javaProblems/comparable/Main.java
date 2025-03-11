package javaProblems.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student vikram  = new Student(11 , 90 );
        Student virat  = new Student(13 , 45 );
        Student vimal  = new Student(12 , 99 );
        Student vishal  = new Student(14 , 92 );
        Student vineeth  = new Student(15 , 24 );
        Student vijay = new Student(16 , 56 );

    Student[] list = { vikram , virat , vimal , vishal , vineeth, vijay};

        Arrays.sort(list);
        System.out.println((vikram.compareTo(vimal) > 0 ) ? "The given obj is higher in marks" : "The given obj not is higher in marks");

        System.out.println(Arrays.toString(list));



    }

}