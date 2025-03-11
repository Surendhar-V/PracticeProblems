package javaProblems;
/*

This code is just a piece of shit.

 */

public class alphabetsequence{

    public static void main(String[] args){

        int a = 2000;
        char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        findsequence( a , arr);

    }

    public static void findsequence(int a , char[] arr){


        if( a <= 26){

            System.out.print(arr[a-1]);
        }


        else{

            if( a <= 702) {
                Double q = a / 26.0 ;
                int r = a% 26 ;


                if( q -  (int)Math.round(q) == 0  ){
                    q-= 1;
                }

                System.out.print(arr[(int)(q - 1)]);

                if( r == 0){
                    System.out.print("Z");
                }
                else{
                    System.out.print(arr[r-1]);
                }

            }


            else if( a <= 1378)
            {
                System.out.print("A");
                a= a - 676 ;
                Double q = a/26.0;
                int r = a% 26 ;

                if( q -  (int)Math.round(q) == 0  ){
                    q-= 1;
                }

                while(q > 26)
                {
                    q-=26;
                }

                System.out.print(arr[(int)(q-1)]);
                if( r == 0){
                    System.out.print("Z");
                }
                else{
                    System.out.print(arr[r-1]);
                }
            }

            else if ( a <= 2000){
                System.out.print("B");

                Double q = a/26.0;
                int r = a% 26 ;

                if( q -  (int)Math.round(q) == 0  ){
                    q-= 1;
                }

                while(q > 26)
                {
                    q-=26;
                }

                System.out.print(arr[(int)(q-1)]);
                if( r == 0){
                    System.out.print("Z");
                }
                else{

                    System.out.print(arr[r-1]);
                }
            }





        }



    }


}