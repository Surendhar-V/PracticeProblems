package javaProblems;

import java.util.stream.IntStream;

public class LeftAlign {
    static char[][] canvas;
    static final int LETTER = 1;
    static final int SPACE = 2;
    static final int N = 6;
    static final int M = 15;

    static int pointer = 0;
    static int cur_line = 0;

    public static void main(String[] args) {

        canvas = new char[N][M];
        //  Lorem ipsum dolor sit amet consectetur adipiscing elit Donec lectus turpis convallis eget pretium ac ultrices rutrum elit
        String res = "Lorem ipsum dolor sit amet consectetur adipiscing elit Donec lectus turpis";
        try {
            helper1(res);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            print();
        }
    }

    private static void print(){
        IntStream.range(0 , M+2).forEach(it -> System.out.print("-"));
        System.out.println();
        for(int i =0 ; i<N;i++){
            System.out.print("|");
            for(int j = 0; j<M ; j++){

                System.out.print(canvas[i][j]);

            }
            System.out.print("|");
            if(i != N-1 ){
                System.out.println();
            }
        }
        System.out.println();
        IntStream.range(0 , M+2).forEach(it -> System.out.print("-"));
    }

    private static void helper1(String res) throws Exception{

        String cur_word = "";
        for(int i =0;i<res.length();i++){
            if(res.charAt(i)==' '){
                cur_word += res.charAt(i);
                if(i+1 != res.length() && res.charAt(i+1) != ' ' || i==res.length()-1){
                    helper2(cur_word);
                    cur_word = "";
                }
            }else {
                cur_word += res.charAt(i);
                if(i+1 != res.length() && res.charAt(i+1)==' ' || i==res.length()-1){
                    helper2(cur_word);
                    cur_word = "";
                }
            }
        }

    }
    private static void helper2(String word) throws Exception{

        boolean is_space_left = computeSpaceLeft(word  , pointer);
        boolean can = canBeAdded(cur_line);

        if(!can){
            throw new Exception("Cannot be added further");
        }

        if(is_space_left){
            while(!word.isEmpty()){
                canvas[cur_line][pointer++] = word.charAt(0);
                word = word.substring(1);
            }
        }else{
            pointer = 0;
            cur_line++;
            helper2(word);
        }

    }

    private static boolean computeSpaceLeft(String word , int pointer){

        int cur_weight = 0;
        if(word.charAt(0) == ' '){
            cur_weight = word.length()*SPACE;
        }else{
            cur_weight = word.length()*LETTER;
        }
        return (cur_weight <= M-pointer-1);
    }

    private static boolean canBeAdded(int line){
        return line<N;
    }

}