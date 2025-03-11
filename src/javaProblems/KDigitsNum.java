package javaProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KDigitsNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n < k) {
            System.out.println("size of k is larger");
            sc.close();
            return;
        }

        List<String> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.next());
        }


        a.sort(Collections.reverseOrder());

        for (String s : a) {
            System.out.print(s + " ");
        }

        System.out.println();

        String max = "";

        if (a.get(0).length() == k) {
            max = a.get(0);
        }


        for (int i = 0; i < n; i++) {
            String var = a.get(i);
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                String temp = var + a.get(j);
                int s = temp.length();

                if (s == k) {
                    if (max.compareTo(temp) < 0) {
                        max = temp;
                    }
                }

                if (s > k) {
                    continue;
                }
                if (s < k) {
                    var = temp;
                }

            }
        }


        System.out.println(max);
        sc.close();
    }
}
