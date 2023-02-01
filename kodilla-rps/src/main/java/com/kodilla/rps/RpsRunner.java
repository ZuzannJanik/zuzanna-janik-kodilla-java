package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        Intro intro = new Intro();
        Menu menu = new Menu();
        Game game = new Game();
        ComputerChoice computerChoice = new ComputerChoice();
  //      while (end!=true) {
        intro.Intro();
        menu.Menu();

       System.out.println("Computer choose " + computerChoice.computerChoice);
   //     if (menu.choice = "1" && random.nextInt(3));


}
}
