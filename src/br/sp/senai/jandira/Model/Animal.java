package br.sp.senai.jandira.Model;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Animal {
    Scanner scanner = new Scanner(System.in);
    public List<Animal> animals = new ArrayList<>();

     public String name, specie, lastCheckUpDate, sex, eatingHabits, medicalHistory, comments, medicine, choice;
    public int age, animalID;

    public void animalRegister() {

        do {
            Animal animal = new Animal();
            animals.add(animal);

            System.out.println("+-------------------- ANIMAL REGISTER --------------------+");
            System.out.print("| Inform the animal's name: ");
            animal.name = scanner.nextLine();

            System.out.print("| Inform the animal's sex [MALE / FEMALE]: ");
            animal.sex = scanner.nextLine();

            if (!sex.equals("MALE") && !sex.equals("FEMALE")) {
                System.out.println("Oops, something went wrong! The animal's sex seems to be incorrect.");
                continue;
            }

            System.out.print("| Inform the animal's age: ");
            animal.age = scanner.nextInt();

            System.out.print("| Set an ID for " + animal.name + " : ");
            animal.animalID = scanner.nextInt();

            scanner.nextLine();

            System.out.print("| Inform the animal's eating habits: ");
            animal.eatingHabits = scanner.nextLine();

            System.out.print("| Inform the animal's medical history: ");
            animal.medicalHistory = scanner.nextLine();

            System.out.print("| Inform the animal's prescribed medications: ");
            animal.medicine = scanner.nextLine();

            System.out.print("| Inform the animal's last checkup date (yyyy-MM-dd): ");
            animal.lastCheckUpDate = scanner.nextLine();

            System.out.print("| Space for any more information about the animal: ");
            animal.comments = scanner.nextLine();

            animals.add(animal);

            System.out.println("------------------------------------------------------");
            System.out.print("Do you want to register another animal? (Y/N): ");
           String choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name);
            System.out.println("Age: " + animal.age);
            System.out.println("Sex: " + animal.sex);
            System.out.println("Specie: " + animal.specie);
            System.out.println("Eating habits: " + animal.eatingHabits);
            System.out.println("Medical history: " + animal.medicalHistory);
            System.out.println("Last check up: " + animal.lastCheckUpDate);
            System.out.println("Taking medicine: " + animal.medicine);
            System.out.println("Additional comments: " + animal.comments);
        }
    }
}
