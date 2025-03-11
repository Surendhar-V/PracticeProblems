package javaProblems.filehandling;

import java.io.*;

public class isr {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr  = new InputStreamReader(System.in);

        try {

            char ch = (char) isr.read();
            while(isr.ready()) {

                System.out.print(ch);
                ch = (char) isr.read();

            }



        }catch (Exception e){

            e.printStackTrace();

        }


    }
}
