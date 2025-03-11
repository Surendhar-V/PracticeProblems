package javaProblems;

public class palindrome_oneException {

    public static void main(String[] args){

        String word = "cadeceac";


//        abcdefedcba
//                12354321
//                        bcdecedcb
//                                cadeceac
//



        int a =findpalindrome(word,0,word.length()-1,0);
        if(a<2) {
            System.out.println("palindrome");
        }
        else{
            System.out.println(a);
            System.out.println("Not a palindrome");
        }


    }


    public static int findpalindrome(String word , int i , int j,int count){


        if( word.length()%2==0){

            if(i==word.length()/2 || j==word.length()/2-1) {
                return count;
            }

        }
        else {


            if (i<word.length()/2 || j>word.length()/2){

                return count;

            }
        }






        if(word.charAt(i) != word.charAt(j)){

            return Math.min(findpalindrome(word , i , j-1,count+1), findpalindrome(word, i+1 , j,count+1));

        }

        return findpalindrome(word , i+1 , j-1 , count );


    }

}
