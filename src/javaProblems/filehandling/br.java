package javaProblems.filehandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class br {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        String input = "";

        try{

            char ch = (char) reader.read();
            input+=ch;

            while(reader.ready()){
                input+=ch;
                ch = (char) reader.read();

            }

            System.out.println(input);

            String[] inputArr = input.split(" "  );

            int a = Integer.parseInt(inputArr[0]);
            String b = inputArr[1];
            double c = Double.parseDouble(inputArr[2]);

            System.out.println( " a (Int) -> "+a);
            System.out.println( " b (String) -> "+b);
            System.out.println( " c (Double) -> "+c);


        }catch (Exception e){

            e.printStackTrace();

        }


    }

}