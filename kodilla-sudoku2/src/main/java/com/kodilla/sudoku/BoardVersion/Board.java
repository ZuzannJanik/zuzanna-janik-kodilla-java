package com.kodilla.sudoku.BoardVersion;

public class Board {
    static int[][] board = new int[9][9];

    static public void cleanBoard() {
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j <9; j++) {
                board[i][j] = 0;
            }
        }
    }

    static public void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int column = 0; column < 9; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][column]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
