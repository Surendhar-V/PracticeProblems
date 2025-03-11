package javaProblems.Dummy;

import java.util.Random;
import java.util.Scanner;

public class Minesweeper {

    private static final int MINE = -1;
    private static final int UNREVEALED = 0;
    private static final int FLAGGED = 2;

    private int[][] board;
    private boolean[][] revealed;
    private int rows, cols, numMines;
    private boolean gameOver;

    private final int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    private final int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public Minesweeper(int rows, int cols, int numMines) {
        this.rows = rows;
        this.cols = cols;
        this.numMines = numMines;
        this.board = new int[rows][cols];
        this.revealed = new boolean[rows][cols];
        this.gameOver = false;
        initializeBoard();
    }

    private void initializeBoard() {
        Random random = new Random();
        int minesPlaced = 0;

        // Place mines
        while (minesPlaced < numMines) {
            int row = random.nextInt(rows);
            int col = random.nextInt(cols);
            if (board[row][col] != MINE) {
                board[row][col] = MINE;
                minesPlaced++;
                updateNeighbors(row, col);
            }
        }
    }

    private void updateNeighbors(int row, int col) {
        // Use dx and dy arrays for 8-directional movement
        for (int i = 0; i < dx.length; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (isInBounds(newRow, newCol) && board[newRow][newCol] != MINE) {
                board[newRow][newCol]++;
            }
        }
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!revealed[i][j]) {
                    System.out.print("[ ]");
                } else if (board[i][j] == MINE) {
                    System.out.print("[*]");
                } else {
                    System.out.print("[" + board[i][j] + "]");
                }
            }
            System.out.println();
        }
    }

    public boolean revealCell(int row, int col) {
        if (!isInBounds(row, col) || revealed[row][col]) {
            return false;
        }
        revealed[row][col] = true;
        if (board[row][col] == MINE) {
            gameOver = true;
            return true;
        }
        if (board[row][col] == 0) {
            for (int i = 0; i < dx.length; i++) {
                revealCell(row + dx[i], col + dy[i]);
            }
        }
        return false;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public boolean hasWon() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] != MINE && !revealed[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Minesweeper!");

        // Set up the game
        System.out.print("Enter the number of rows: ");

        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");

        int cols = scanner.nextInt();

        System.out.print("Enter the number of mines: ");

        int numMines = scanner.nextInt();

        Minesweeper game = new Minesweeper(rows, cols, numMines);

        // Main game loop

        while (!game.isGameOver() && !game.hasWon()) {

            game.displayBoard();

            System.out.print("Enter row and column to reveal (e.g., 1 2): ");

            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.revealCell(row - 1, col - 1)) {

                System.out.println("Boom! You hit a mine.");
                game.displayBoard();
                System.out.println("Game over!");
                return;

            }

        }

        if (game.hasWon()) {
            System.out.println("Congratulations! You've won!");
        } else {
            System.out.println("Game over!");
        }

        scanner.close();
    }

}
