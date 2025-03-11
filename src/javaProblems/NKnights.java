package javaProblems;

public class NKnights {

    public static void main(String[] args) {

        int knights = 4;
        int size = 4;

        boolean[][] board = new boolean[size][size];

        knights(board , 0 , 0 , 0 , knights);

    }

    private static void knights(boolean[][] board , int row , int col , int curknights , int totalKnights) {

        if (curknights == totalKnights) {
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board[row].length){
            return;
        }

        if (col == board[row].length) {
            knights(board , row + 1 , 0 , curknights , totalKnights);
            return;
        }

        if (isSafe(row , col , board)) {
            board[row][col] = true;
            knights(board , row , col + 1 , curknights + 1 , totalKnights);
            board[row][col] = false;
        }

        knights(board , row , col + 1 , curknights , totalKnights);

    }

    private static boolean isSafe(int row , int col , boolean[][] board) {

        if (isValid(row - 1 , col - 2 , board) && board[row - 1][col - 2]) {
            return false;
        }

        if (isValid(row - 1 , col + 2 , board) && board[row - 1][col + 2]) {
            return false;
        }

        if (isValid(row - 2 , col - 1 , board) && board[row - 2][col - 1]) {
            return false;
        }

        if (isValid(row - 2 , col + 1 , board) && board[row - 2][col + 1]) {
            return false;
        }

        return true;

    }

    private static boolean isValid(int row , int col , boolean[][] board) {
        return (row >= 0 && row < board.length && col >= 0 && col < board[row].length);
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }

    }

}
