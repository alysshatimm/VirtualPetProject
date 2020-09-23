package virtual_pet;

import java.awt.*;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new RoboticPets("Jeff", 10, 10, 10);
        VirtualPet Steve = new OrganicPets("Steve", 8, 7, 5);
        VirtualPet Charlie = new RoboticPets("Charlie", 15, 20, 30);
        VirtualPet Daisy = new OrganicPets("Daisy", 12, 7, 25);
        VirtualPet Kendrick = new RoboticPets("Kendrick", 56, 83, 32);
        VirtualPet Lucinda = new OrganicPets("Lucinda", 99, 99, 99);
        shelter.addPet(Jeff);
        shelter.addPet(Steve);
        shelter.addPet(Charlie);
        shelter.addPet(Daisy);
        shelter.addPet(Kendrick);
        shelter.addPet(Lucinda);


        Scanner inputScanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE AKM VIRTUAL PET ADOPTION AGENCY!");
        System.out.println("Here are the available pets for adoption:");
        System.out.println();

        for (VirtualPet petToDisplay : shelter.retrievePets()) {
            System.out.println(petToDisplay);
            System.out.println();
        }
        System.out.println("INSTRUCTIONS:");
        System.out.println();
        System.out.println("Enter 1 to feed all the pets ");
        System.out.println("Enter 2 to give water to all the pets ");
        System.out.println("Enter 3 to play with all the pets");
        System.out.println("Enter 4 to remove a pet ");
        System.out.println("Enter 5 to add a pet ");
        System.out.println("To leave the adoption agency, please type \"Quit\"");
        String userInput = inputScanner.nextLine();
        while (!userInput.equalsIgnoreCase("quit")) {
            if (userInput.equalsIgnoreCase("1")) {
                shelter.feedAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("2")) {
                shelter.waterAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("3")) {
                shelter.playWithAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("4")) {
                System.out.println("Which pet would you like to remove?");
                String petNameToRemove = inputScanner.nextLine();
                shelter.removePet(petNameToRemove);
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("5")) {
                System.out.println("What is the name of the pet you're adding?");
                String petName = inputScanner.nextLine();
                VirtualPet petNameToAdd = new RoboticPets(petName, 10, 10, 10);
                shelter.addPet(petNameToAdd);
            }
            for(VirtualPet petToDisplay : shelter.retrievePets()){
                System.out.println(petToDisplay);
            }
            System.out.println("Enter 1 to feed all the pets ");
            System.out.println("Enter 2 to give water to all the pets ");
            System.out.println("Enter 3 to play with all the pets");
            System.out.println("Enter 4 to remove a pet ");
            System.out.println("Enter 5 to add a pet ");
            userInput = inputScanner.nextLine();
            }
        }

    }






