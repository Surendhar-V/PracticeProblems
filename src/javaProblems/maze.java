package javaProblems;

import java.util.*;
public class maze
{
    public static void main(String[] args) {

        // 2 refers door ; 0 refers home

        int r = 0;
        int c =0;
        int[] home= {2,2};
        String p ="";
        int[] door={ 1,1};
        path(p , r ,c, maze,home,door);
    }

    private static final int[][] maze = { {1,1,0},
            {1,2,1},
            {1,1,0}
    };

    public static void  path(String p , int r , int c , int[][] maze , int[] home , int[] door){

        if(r==door[0] && c==door[1]){
            if(maze[r][c] == 2){
                maze[door[0]][door[1]] = 1;
                maze[home[0]][home[1]] = 1;
                p+="        OPENED      ";
                System.out.println(Arrays.deepToString(maze));

                // path(p+"     " , door[0] ,door[1], maze,home,door);


            }

            System.out.println("2"+ Arrays.deepToString(maze));


        }


        if(maze[r][c]!=1 && maze[r][c] !=2 ){
            return ;
        }

        if(r==home[0] && c==home[1]){

            System.out.println(p);
            return;
        }

        maze[r][c] = 0;

        if(r<maze.length-1){
            path(p+"Down ",r+1,c,maze,home,door);
        }
        if(c<maze[0].length-1){
            path(p+"Right ",r,c+1,maze,home,door);
        }
	    /*
	    if(r>0){
	        path(p+"Up ",r-1,c,maze,home,door);
	    }

	    if(r!=maze.length-1 && c!=maze[0].length-1){
	        path(p+"Diagonal ",r+1,c+1,maze , home,door);
	    }
	  */


        maze[r][c] = 1;         // Back tracking

    }

}
