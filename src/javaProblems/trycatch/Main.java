package javaProblems.trycatch;

public class Main {

    public static void main(String[] args) {

        int a = 9 ;
        int b = 0 ;

        try{
            int c = divide(a , b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        catch (ArithmeticException c){
//            System.out.println( c.getMessage());
//        }                                                               //error


        finally {
            System.out.println("I will print autmatically");
        }

    }

   static int divide(int a , int b) throws ArithmeticException {

        if( b== 0){
            throw new ArithmeticException("shfjash;fjhs;jhdf;l");

        }
        return a/b;



   }

}
