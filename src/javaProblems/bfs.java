package javaProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {

        int[][] edges = {
                {5 , 0} ,
                {4 , 0} ,
                {4 , 1} ,
                {5 , 2} ,
                {2 , 3} ,
                {3 , 1}
        };

        int maxVertex = 0;

        for (int[] edge : edges) {
            maxVertex = Math.max(maxVertex , Math.max(edge[0] , edge[1]));
        }

        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i <= maxVertex; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjacencyList.get(u).add(v);
            adjacencyList.get(v).add(u);
        }

        List<Integer> res = bfs(maxVertex + 1 , adjacencyList);
        System.out.println(res);

    }

    private static List<Integer> bfs(int v , ArrayList<ArrayList<Integer>> adjList) {

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visit = new boolean[v];
        List<Integer> res = new ArrayList<>();

        queue.add(0);
        visit[0] = true;

        while (!queue.isEmpty()) {

            int node = queue.poll();
            res.add(node);

            for (int adjNode : adjList.get(node)) {
                if (!visit[adjNode]) {
                    visit[adjNode] = true;
                    queue.add(adjNode);
                }
            }

        }

        return res;


    }


}