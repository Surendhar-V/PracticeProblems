package javaProblems;

public class nextPowerOf2 {

    public static void main(String[] args) {

        System.out.println(nextPowerOf2(-23489655));

    }

    private static int nextPowerOf2(int cap) {

        int n = cap - 1;

        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;

        return n;

    }
}
