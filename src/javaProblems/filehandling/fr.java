package javaProblems.filehandling;

import java.io.*;

public class fr {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\vsure\\Idea Projects\\PracticeProblems_Java\\src\\filehandling\\TestFile.txt");

            FileReader fr = new FileReader(file);

            while(fr.ready()) {
                char ch = (char) fr.read();
                System.out.print(ch);
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }



    }

}