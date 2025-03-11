package javaProblems.BitManipulation;

public class Main {


    public static void main(String[] args) {

        swap();
        removeTheLastSetBit();
        checkPowerOf2();
        countSetBits();

    }

    private static void swap() {

        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);

        System.out.println();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
        System.out.println();

    }

    private static void removeTheLastSetBit() {

        int a = 40;         // 101000

        /*
             We have to remove the last set a bit from the right. (4th from the right)
             If we did (n-1) the number , the last set bit will be zero and the bit after that will be 1.
             Therefore, we can do the & with (n-1)

             40 ->  1_01_000
             39 -> 1_00_111

             40 & 39 -> 1_00_000

         */

        System.out.println(Integer.toBinaryString(a));
        System.out.println(a & (a - 1));
        System.out.println(Integer.toBinaryString(a & (a - 1)));
        System.out.println();

    }

    private static void checkPowerOf2() {

        /*

        The Number which is power of 2 will have only one set bit.

        The brute force way is to count the number of set bit and say the result.

        The most optimal way is to do the "Remove the last set bit" function.
        if done so , the number will become to 0 since there is one bit.
        So we can come to the conclusion whether it is the power of 2 or not.

         */

        int a = 40;
        int b = 16;
        int c = 32;

        System.out.println((a & (a - 1)) == 0);
        System.out.println((b & (b - 1)) == 0);
        System.out.println((c & (c - 1)) == 0);

        System.out.println();

    }

    private static void countSetBits(){

        /*

         The Brute force approach for this problem is
         we can use the right shift operator and count the value of the last
         bit , unit the number become zero.

         It is the better or brute force approach.
         But the Most optimal approach is the below............

         If we do repeatedly "remove the last bit" operation until the number becomes zero,
         then we can  come to the conclusion of number of set bits in that number.

         */

        int i = 35;
        int counter = 0;
        System.out.println(Integer.toBinaryString(i));

        while(i != 0){
            i = (i & (i-1));
            counter++;
        }

        System.out.println(counter);
        System.out.println();

    }
}
