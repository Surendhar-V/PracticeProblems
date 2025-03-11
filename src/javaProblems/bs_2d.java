package javaProblems;/*

INTUITION - Initially , we make the row and the column to be at 0 and arr[0].length-1 respectively.
            And we check whether the element is greater than the search , If yes C--;
            If no , R++;
            If equal , we return the corresponding row and column value;

*/




import java.util.Arrays;

public class bs_2d {
    public static void main(String[] args) {

        // 4*4 matrices;
        // row => arr.length;
        // col => arr[0].length;

        /*



           {
                {1, 5, 9, 13},
                {2, 6, 10, 14},
                {3, 7, 11, 15},
                {4, 8, 12, 16}

                }




                 */

        int[][] arr =                {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
};
        int search = 16;
        System.out.println(Arrays.toString(binarysearch(arr, search)));



    }

    private static int[] binarysearch(int[][] arr, int search) {

        int r = 0;
        int c = arr.length - 1;

        while (c >= 0 && r < arr.length ) {

            if (arr[r][c] == search) {
                return new int[]{r ,c };

            }
            if (arr[r][c] > search) {
                c--;
            } else {
                r++;
            }
        }
        return  new int[]{ -1 , -1};
    }
}
