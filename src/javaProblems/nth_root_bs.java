package javaProblems;/*

INTUITION -Lets say ,  Our task is to find the square root of the number .
`          It is obvious that the square root lies between the 0 to the number .
           0 to number is a ascending order series .
           so we can use the modified binary search algorithm to search the square root the number .

 */

public class nth_root_bs {
    public static void main(String[] args) {
        root(3,27);

    }

    private static void root(int n, int x) {

        double start =0;
        double end = x;
        double precision = 1e-6;

        while((end-start)>precision) {
            double mid = (start+end)/2;
            if (Math.pow(mid, n) > x) {
                start = mid;
            } else {
                start = mid;
            }
        }
        System.out.println(start+"  "+end);


        }


    }

