package javaProblems.Streams;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryStringInteger {
    public static void main(String[] args) {

        String s = "1110";
        int res = IntStream.range(0 , s.length()).boxed().collect(Collectors.summingInt( (i) -> ((s.charAt(i)-'0')*(int)Math.pow(2.0 , (double) s.length()-1-i))));
        System.out.println(res);
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(3);
        set.add(2);
        set.stream().toList();
    }
}
