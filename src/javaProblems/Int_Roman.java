package javaProblems;// valid upto 1-39;


import java.util.Scanner;
public class Int_Roman {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);
        // String roman= input.nextLine();

        int a = 39;

        if(((int) Math.log10(a)+1) >=2){



            for(int i =1;i<=a/10;i++){

                ten();


            }

            converter1(a%10);



        }



    }

    public static void converter1(int num){



        if( num == 10){
            ten();
        }



        else if (5<num && 8>=num) {
            System.out.print("V");
            converter2(num-5);

        }

        else
        {
            converter2(num);
        }


    }
    private static void ten(){
        System.out.print("X");
    }

    private static void converter2(int num2) {

        if(num2==4){
            System.out.print("|V");
        }
        else if (num2 == 5) {
            System.out.print("V");
        }
        else if( num2 == 9){
            System.out.print("|X");
        }

        else if(3>=num2 && 1<=num2){
            int j = 0;
            while(j != num2){
                System.out.print("|");
                j++;
            }
        }





    }





}
