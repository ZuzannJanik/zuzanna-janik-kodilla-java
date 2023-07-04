package com.kodilla.sudoku.BoardVersion;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Board board = new Board();
        Solver solver = new Solver();

        board.printBoard(board.board);
        System.out.println();
        menu.attemptNumber();

        if  (solver.solveBoard(board.board)) {
            System.out.println("I solved it for you!!");
            System.out.println("You got the numbers right!");
            System.out.println();
            System.out.println("This is how your sudoku solution looks like:");
            board.printBoard(board.board);
        } else {
            System.out.println("I'm sorry I can't solve it...");
            System.out.println("Did you know that a correctly constructed sudoku, even on a very difficult level, has only one solution?");
        }
    }
}
