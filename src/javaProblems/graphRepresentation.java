package javaProblems;

import java.util.ArrayList;

public class graphRepresentation {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i  = 0 ; i<=n ; i++){
            adj.add(new ArrayList<>());
        }

//        edge 1 --> 2
        adj.get(1).add(2);
        adj.get(2).add(1);

//        edge 2 --> 3
        adj.get(2).add(3);
        adj.get(3).add(2);

//        edge 1 --> 3
        adj.get(1).add(3);
        adj.get(3).add(1);

        
    }
}
