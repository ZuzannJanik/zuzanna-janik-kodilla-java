package com.kodilla.jdbc.sudoku;

public class Board {
    char[][] board = new char[9][9];
    public void printBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("\t");
                for (int k = 0; k < 9; k++) {
                    System.out.print(k + "\t");
                }
                System.out.println();
                for (int row = 0; row < 9; row++) {
                    System.out.print(row + ":\t");
                    for (int column = 0; column < 9; column++) {
                        System.out.print(board[row][column] + "\t");
                    }
                    System.out.println();
                }
            }
        }
    }
}

