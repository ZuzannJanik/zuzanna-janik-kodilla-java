package com.kodilla.sudoku.BoardVersion;

import java.util.Scanner;

import static com.kodilla.sudoku.BoardVersion.Board.*;
import static com.kodilla.sudoku.BoardVersion.Solver.isValidPlacement;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int attempt;
    int choice;
    private static String userNumber;
    static String columnNumber;
    static String rowNumber;
    static String valueNumber;

    public void printMenu() {
        System.out.println("Your task is to enter " + attempt + " values in the SUDOKU");
        System.out.println("Please provide them by entering [column][row][value].");
        System.out.println("For example: 123");
        System.out.println("Means '1' column, '2' row and the number to be inserted is '3'");
        System.out.println();
           numberSelection();
    }

    public void numberSelection() {
            for (int i = 0; i < attempt; i++) {
                System.out.println("Enter " + (i + 1) + " number according to the formula CRV");
                choice = scanner.nextInt();
                if (String.valueOf(choice).length() == 3) {
                    userNumber = String.valueOf(choice);
                    columnNumber = userNumber.substring(0, 1);
                    rowNumber = userNumber.substring(1, 2);
                    valueNumber = userNumber.substring(2, 3);
                    if (board[Integer.parseInt(columnNumber)-1][Integer.parseInt(rowNumber)-1] == 0) {
                        if (isValidPlacement(board,Integer.parseInt(valueNumber),Integer.parseInt(rowNumber)-1, Integer.parseInt(columnNumber)-1)) {
                            board[Integer.parseInt(columnNumber)-1][Integer.parseInt(rowNumber)-1] = Integer.parseInt(valueNumber);
                        } else {
                            System.out.println("This number is already in the column/row/box");
                            cleanBoard();
                            numberSelection();
                        }
                    } else {
                        System.out.println("This field is already filled in.");
                        cleanBoard();
                        numberSelection();
                    }
                } else {
                    System.out.println("ERROR - wrong number of characters");
                    cleanBoard();
                    numberSelection();
                }
            }
            printBoard(board);
        }
    public void attemptNumber() {
        System.out.println("How many numbers do you want to enter? (minimum 1 and 81 max)");
        attempt = scanner.nextInt();
        if (attempt > 0 ) {
            printMenu();
        } else if (attempt == 0) {
            System.out.println("Not enough numbers");
            System.out.println("Please enter at least 1 number");
            attemptNumber();
        } else if (attempt > 81) {
            System.out.println("The board doesn't have that many squares");
            System.out.println("Please enter maximum 81 numbers");
            attemptNumber();
        }
    }
}

