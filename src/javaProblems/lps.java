package javaProblems;// Manacher's Algorithm

import java.util.*;

public class lps {
    public static void main(String[] args) {

        String s = "aacecaaa";

        System.out.println(findLps(s));

    }

    private static String findLps(String s) {

        List<Character> Plist = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {

            Plist.add('#');
            Plist.add(s.charAt(i));

        }

        Plist.add('#');

//        System.out.println(Plist);

        int[] Parr = new int[Plist.size()];

        int r = 0;
        int c = 0;

        for (int i = 1; i < Plist.size() - 1; i++) {

            if (i < r) {

                Parr[i] = Math.min(Parr[2 * c - i] , r - i);

            }

            // Plist and Parr has same length

            boolean dummy = (i - (Parr[i] + 1)) > -1 && (i + (Parr[i] + 1)) < Plist.size();

            while (dummy && (Plist.get(i - (Parr[i] + 1))) == (Plist.get(i + (Parr[i] + 1)))) {

                Parr[i]++;
                dummy = (i - (Parr[i] + 1)) > -1 && (i + (Parr[i] + 1)) < Plist.size();
            }


            if (i + Parr[i] > r) {

                r = Parr[i] + i;
                c = i;

            }

        }

        System.out.println(Arrays.toString(Parr));

        int max = 0;
        int index = 0;

        for (int i = 0; i < Parr.length; i++) {

            if (Parr[i] > max) {
                index = i;
                max = Parr[i];
            }
        }


        String res = "";

        for (int i = index - max; i <= index + max; i++) {

            if (Plist.get(i) != '#') {
                res = res + Plist.get(i);
            }

        }


        return res;
    }

}
