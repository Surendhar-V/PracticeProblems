package javaProblems.HuffmanCoder;

public class Main {

    public static void main(String[] args) throws Exception {

        String str = "abcdefghijklmnopqrstuvabcdefghwxyzrstuvwxyzklmnopqrstuvw ";
        huffmanCoding hf = new huffmanCoding(str);

        String cs = hf.encode("you are gay");
        System.out.println(cs);

        String dc = hf.decode(cs);
        System.out.println(dc);

        System.out.println(hf.encoder);
        System.out.println(hf.decoder);



    }
}
