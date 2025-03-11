package javaProblems.filehandling;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        System.out.println('\u263A');
        OutputStream os = System.out;
        try {

            byte[] smileyBytes = "\u263A".getBytes(StandardCharsets.UTF_8);
            os.write(smileyBytes);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}