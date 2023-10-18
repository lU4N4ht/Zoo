package br.sp.senai.jandira.Model;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    public void menuChoice() {
        while (!exit) {
            System.out.println("+______________________________________________________+");
            System.out.println("|                  L U L U L I B R A R Y               |");
            System.out.println("+______________________________________________________+");
            System.out.println("|        W E L C O M E  T O  T H E  L I B R A R Y !    |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register.........................................|");
            System.out.println("| 2 - Manage Accommodations............................................|");
            System.out.println("| 3 - Library..........................................|");
            System.out.println("| 4 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
