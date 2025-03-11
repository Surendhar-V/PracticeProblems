package javaProblems;

public class patterns{

    public static void main(String[] args) {

     pattern(7);


    }

    public static void pattern(int n) {

        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-i;j++){

                if(i+j >n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }

    }

}