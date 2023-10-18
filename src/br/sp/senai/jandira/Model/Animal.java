package br.sp.senai.jandira.Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Animal {
    Scanner scanner = new Scanner(System.in);
    public List<Animal> animals = new ArrayList<>();

    String name, specie, sex, eatingHabits, medicalHistory, comments, medicine, choice;
    int age, animalID;
    Date dateLastCheckup;

    public void animalRegister() {

        for(; choice.equalsIgnoreCase("Y"); ) {

            Animal animal = new Animal();

            System.out.println("+-------------------- ANIMAL REGISTER --------------------+");
            System.out.print("| Inform the animal's name: ");
            animal.name = scanner.nextLine();
            System.out.print("| Inform the animal's sex [MALE / FEMALE]: ");
            animal.sex = scanner.nextLine();
            if(!choice.equalsIgnoreCase("MALE") && !choice.equalsIgnoreCase("FEMALE")){
                JOptionPane.showMessageDialog(null, "Oops, something went wrong! The animal's sex seems to be incorrect.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            System.out.print("| Inform the animal's age:");
            animal.age = scanner.nextInt();

            System.out.print("| Set an ID for " + animal.name + " : ");
            animal.animalID = scanner.nextInt();

            scanner.nextLine();

            System.out.print("| Inform the animal's eating habits:");
            animal.eatingHabits = scanner.nextLine();
            System.out.print("| Inform the animal's medical history:");
            animal.medicalHistory = scanner.nextLine();
            System.out.print("| Inform the animal's prescribed medications:");
            animal.medicine = scanner.nextLine();
            System.out.print("| Inform the animal's last checkup date:");

            System.out.print("| Space for any more information about the animal:");
            animal.comments = scanner.nextLine();


            animals.add(animal);

            System.out.println("------------------------------------------------------");
            System.out.println("Do you want to register another animal? (Y/N): ");
            choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                break;

            }
        }
    }

}
