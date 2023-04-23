package com.kodilla.sudoku;

import java.util.ArrayList;

public class SudokuBoard {
    static ArrayList<SudokuRow> sudokuBoard = new ArrayList<>();
    static SudokuRow sudokuRow = new SudokuRow();
    static SudokuElement sudokuElement = new SudokuElement();

    public void buildBoard() {
        for (int row = 0; row < 9; row++) {
            sudokuBoard.add(row, new SudokuRow());
        }
    }
    private boolean checkInRow() {
        for (int row = 0; row < 9; row++) {
            if(sudokuRow.getSudokuRow().contains(number)) {
                return true;
            }
        }
        return false;
    }
    private boolean checkInColumn() {
        for (int column = 0; column < 9 ; column++) {
            if (sudokuRow.getSudokuRow().get(column) == number) {
                return true;
            }
        }
        return false;
    }

    private boolean checkInBox(int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (getValue(i,j) == number) {
                    return true;
                }
            }
        }
        return false;
    }

    static void printBoard() {
        for (int row = 0; row < 9; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
        }
            for (int column = 0; column < 9; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print("|");
                }
            }
             //   sudokuRow.addColumn();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                        System.out.print(sudokuElement.getValue());
                    }
                    System.out.println(sudokuRow.getSudokuRow());
                }
                System.out.println();
            }
        }



