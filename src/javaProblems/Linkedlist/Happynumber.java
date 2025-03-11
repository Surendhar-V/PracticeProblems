package javaProblems.Linkedlist;

class Happynumber {
    public static void main(String[] args){

        System.out.println(isHappy(19));

    }

    public static boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = happy(slow);
            fast = happy(happy(fast));

            if( slow == 1){
                return true ;
            }

        }while(slow != fast);



        return false ;

    }

    public static int happy(int n){

        int rem = 0 ;
        int sum  = 0;
        while(n > 0){

            rem = n%10 ;
            sum += rem*rem ;
            n = n/10 ;

        }
        return sum ;



    }

}