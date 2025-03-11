package javaProblems.XO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //int[][] board={{2,2,2},{2,2,2},{2,2,2}};
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        play(board, input);


    }


    public static void play(int[][] board, Scanner input) {


        while (true) {
            System.out.println("Enter your position....\n X= ");
            int currentX = input.nextInt();
            System.out.println("Y= ");
            int currentY = input.nextInt();
            System.out.println("Enter the Block( 0 for X , 1 for O ) ");
            int currentBlock = input.nextInt();

            board[currentX - 1][currentY - 1] = currentBlock;

            board[currentX][currentY] = currentBlock;
            int a = canWin(board, currentX, currentY, currentBlock);

            if (a != 0) {
                System.out.println(currentBlock + " Won ");
                System.out.println(a);
            }
        }


    }


    public static int canWin(int[][] board, int currentX, int currentY, int currentBlock) {

        int a = 0;

        List<Integer> leftPossibilities = new ArrayList<>();
        List<Integer> rightPossibilities = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {

            a = isSafe1(board, currentX, currentY, currentBlock, i);

            if (a != 9) {


                if ((i == 2 || i == 4) && ((currentX == currentY && i == 4) || (currentX + currentY == 4 && i == 2))) {
                    leftPossibilities.add(a);
                } else if (i == 1 || i == 3 && a == i) {

                    leftPossibilities.add(a);
                }


            }

        }

        for (int i = 1; i <= 4; i++) {

            a = isSafe2(board, currentX, currentY, currentBlock, i);

            if (a != 9) {


                if ((i == 2 || i == 4) && ((currentX == currentY && i == 4) || (currentX + currentY == 4 && i == 2))) {
                    rightPossibilities.add(a);
                } else if ((i == 1 || i == 3) && a == i) {

                    rightPossibilities.add(a);

                }


            }

        }

        int common = checkCommon(leftPossibilities, rightPossibilities);

        return common;

    }

    public static int checkCommon(List<Integer> l1, List<Integer> l2) {

        int common = 0;

        for (int a : l1) {
            for (int b : l2) {
                if (a == b) {
                    common = a;
                    break;
                }

            }
        }


        return common;
    }


    public static int isSafe1(int[][] board, int currentX, int currentY, int currentBlock, int i) {

        if (i == 1) {

            if (currentY == board.length - 1) {
                return i;
            }

            if (board[currentX][currentY + 1] == currentBlock) {
                return isSafe1(board, currentX, currentY + 1, currentBlock, i);
            }

        } else if (i == 2) {

            if (currentY == board.length - 1 || currentX == 0) {
                return i;
            }

            if (board[currentX - 1][currentY + 1] == currentBlock) {


                return isSafe1(board, currentX - 1, currentY + 1, currentBlock, i);

            }

        } else if (i == 3) {

            if (currentX == 0) {
                return i;
            }
            if (board[currentX - 1][currentY] == currentBlock) {


                return isSafe1(board, currentX - 1, currentY, currentBlock, i);

            }

        } else if (i == 4) {

            if (currentX == 0 || currentY == 0) {

                return i;

            }

            if (board[currentX - 1][currentY - 1] == currentBlock) {


                return isSafe1(board, currentX - 1, currentY - 1, currentBlock, i);

            }


        }

        return 9;
    }

    public static int isSafe2(int[][] board, int currentX, int currentY, int currentBlock, int i) {

        if (i == 1) {

            if (currentY == 0) {
                return i;
            }

            if (board[currentX][currentY - 1] == currentBlock) {

                return isSafe1(board, currentX, currentY - 1, currentBlock, i);

            }

        } else if (i == 2) {

            if (currentY == 0 || currentX == board.length - 1) {
                return i;
            }

            if (board[currentX + 1][currentY - 1] == currentBlock) {

                return isSafe1(board, currentX + 1, currentY - 1, currentBlock, i);

            }

        } else if (i == 3) {

            if (currentX == board.length - 1) {
                return i;
            }
            if (board[currentX + 1][currentY] == currentBlock) {


                return isSafe1(board, currentX + 1, currentY, currentBlock, i);

            }

        } else if (i == 4) {

            if (currentX == board.length - 1 || currentY == board.length - 1) {

                return i;

            }

            if (board[currentX + 1][currentY + 1] == currentBlock) {

                return isSafe1(board, currentX + 1, currentY + 1, currentBlock, i);

            }


        }

        return 9;
    }

}
