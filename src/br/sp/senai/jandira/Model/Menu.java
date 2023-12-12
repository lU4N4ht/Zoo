package br.sp.senai.jandira.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Animal animal = new Animal();
    Accommodation accommodation = new Accommodation();

    boolean exit = false;
    public void menuChoice() {
        while (!exit) {
            System.out.println("+______________________________________________________+");
            System.out.println("|                  L U L U L I B R A R Y               |");
            System.out.println("+______________________________________________________+");
            System.out.println("|        W E L C O M E  T O  T H E  L I B R A R Y !    |");
            System.out.println("+______________________________________________________+");
            System.out.println("| Chose one option.....................................| ");
            System.out.println("| 1 - Register an Animal...............................|");
            System.out.println("| 2 - Manage Accommodations............................|");
            System.out.println("| 3 - List Animals.....................................|");
            System.out.println("| 4 - Check Animal's health history....................|");
            System.out.println("| 5 - Exit.............................................|");
            System.out.println("+______________________________________________________+");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    animal.animalRegister();
                    break;
                case 2:
                    System.out.println("[1] Add other accommodation");
                    System.out.println("[2] List accommodations");
                    int choiceAccommodation = scanner.nextInt();

                    switch (choiceAccommodation) {
                        case 1:
                            accommodation.accommodationRegister();
                            break;
                        case 2:
                            accommodation.listAccommodations();
                            break;
                        default:
                            System.err.println("Choose a valid option!");
                    }
                    break;
                case 3:
                    animal.listAnimals();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
    }
}
