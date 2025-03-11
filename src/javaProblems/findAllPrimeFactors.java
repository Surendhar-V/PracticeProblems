package javaProblems;

public class findAllPrimeFactors {

    public static void main(String[] args) {

//        int num = 315;
        int num = 12;
        helper(num);

    }

    private static void helper(int num){

        while (num%2==0){

            System.out.print(2+" ");
            num/=2;

        }

        for(int i=3 ; i<=Math.sqrt(num);i+=2){

            while(num%i == 0){
                System.out.print(i+" ");
                num = num/i;
            }

        }

        if(num>2){
            System.out.println(num);
        }



    }
}