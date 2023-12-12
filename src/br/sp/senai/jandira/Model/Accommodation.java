package br.sp.senai.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Accommodation {
    Scanner scanner;
    public List<Accommodation> accommodations = new ArrayList<>();
    public String name, type, description;
    public int id;


    public void accommodationRegister() {
        String choice;
        do {

            Accommodation accommodation = new Accommodation();
            accommodations.add(accommodation);


            System.out.println("+--------------- ACCOMMODATION REGISTER ---------------+");
            System.out.print("| Choose the accommodation type [AQUATIC | TERRESTRIAL | HYBRID]: ");
            String typeChoice = scanner.nextLine();

            switch (typeChoice.toUpperCase()) {
                case "AQUATIC":
                    accommodation = new Aquatic();
                    accommodation.type = "Aquatic";
                    break;
                case "TERRESTRIAL":
                    accommodation = new Terrestrial();
                    accommodation.type = "Terrestrial";
                    break;
                case "HYBRID":
                    accommodation = new Hybrid();
                    accommodation.type = "Hybrid";
                    break;
                default:
                    System.err.println("Invalid accommodation type.");
            }

            System.out.print("| Inform the accommodation's name: ");
            accommodation.name = scanner.nextLine();
            System.out.print("| Inform the accommodation's description: ");
            accommodation.description = scanner.nextLine();
            System.out.print("| Inform the accommodation's ID: ");
            accommodation.id = scanner.nextInt();


            System.out.println("------------------------------------------------------");
            System.out.print("Do you want to register another accommodation? (Y/N): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));
    }

    public void listAccommodations() {
        for (Accommodation accommodation : accommodations) {
            System.out.println("Name: " + accommodation.name);
            System.out.println("Type: " + accommodation.type);
            System.out.println("ID: " + accommodation.id);
            System.out.println("Description: " + accommodation.description);
        }
    }
}
