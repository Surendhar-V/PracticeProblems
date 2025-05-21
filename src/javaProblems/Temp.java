package javaProblems;

class Temp {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        Main main = new Main();
        System.out.println(main.colorTheGrid(m, n));
    }

    public int colorTheGrid(int m, int n) {
        char[][] board = new char[n][m];

        char[] RGB = {'R', 'G', 'B'};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = ' ';
            }
        }

        return helper(board, 0, 0, RGB);
    }

    private int helper(char[][] board, int row, int col, char[] RGB) {
        if (row >= board.length) {
            return 1;
        }

        if (col >= board[0].length) {
            return helper(board, row + 1, 0, RGB);
        }

        int ans = 0;

        for (char c : RGB) {
            boolean canUse = true;

            if (row > 0 && board[row - 1][col] == c) {
                canUse = false;
            }

            if (col > 0 && board[row][col - 1] == c) {
                canUse = false;
            }

            if (canUse) {
                board[row][col] = c;
                ans += helper(board, row, col + 1, RGB);
                board[row][col] = ' ';
            }
        }

        return ans;
    }

}