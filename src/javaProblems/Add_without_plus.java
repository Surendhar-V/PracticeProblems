package javaProblems;

class Add_without_plus {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        int res = sum(a , b);
        System.out.println(res);

    }

    private static int sum(int a , int b) {

        int carry = 0;

        while (b != 0) {

            carry = a & b;
            a = a ^ b;
            b = carry << 1;

        }


        return a;
    }

}