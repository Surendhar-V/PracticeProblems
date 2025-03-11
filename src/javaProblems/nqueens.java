package javaProblems;

public class nqueens {

    public static void main(String[] args) {

        int row = 0;
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(row, board);

    }

    public static void queens(int row, boolean[][] board) {

        if (row == board.length) {
            display(board);
            return;
        }

        for (int c = 0; c < board.length; c++) {

            if (isSafe(row, c, board)) {
                board[row][c] = true;
                queens(row + 1, board);
                board[row][c] = false;
            }

        }

    }

    public static void display(boolean[][] board) {

        for (boolean[] a : board) {
            for (boolean b : a) {

                if (b) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println();
        }
        System.out.println();

    }

    public static boolean isSafe(int row, int col, boolean[][] board) {

        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        for (int j = 1; j <= Math.min(row, col); j++) {
            if (board[row - j][col - j]) {
                return false;
            }
        }

        for (int k = 1; k <= Math.min(board[0].length - col - 1, row); k++) {
            if (board[row - k][col + k]) {
                return false;
            }
        }

        return true;

    }
}
