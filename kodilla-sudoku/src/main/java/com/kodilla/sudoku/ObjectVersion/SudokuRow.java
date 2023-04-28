package com.kodilla.sudoku.ObjectVersion;

import com.kodilla.sudoku.ObjectVersion.SudokuElement;

import java.util.ArrayList;

public class SudokuRow {
    ArrayList<SudokuElement> sudokuRow = new ArrayList<>();

    public void addColumn() {
        for (int column = 0; column < 9; column++) {
            sudokuRow.add(column, new SudokuElement());
        }
    }

    public SudokuRow() {
        this.sudokuRow = sudokuRow;
    }

    public ArrayList<SudokuElement> getSudokuRow() {
        return sudokuRow;
    }

}
