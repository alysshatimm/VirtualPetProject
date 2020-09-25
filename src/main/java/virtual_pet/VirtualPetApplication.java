package virtual_pet;

import java.awt.*;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new RoboDogs("RoboJeff", 10, 10, 10);
        VirtualPet Steve = new OrganicCats("Steve", 10, 10, 10);
        VirtualPet Charlie = new RoboCats("RoboCharlie", 10, 10, 10);
        VirtualPet Daisy = new OrganicCats("Daisy", 12, 7, 25);
        VirtualPet Kendrick = new RoboDogs("RoboKendrick", 56, 83, 32);
        VirtualPet Lucinda = new OrganicDog("Lucinda", 20, 20, 20);
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
        System.out.println("Enter 1 to feed the Organic pets");
        System.out.println("Enter 2 to give water to the Organic pets");
        System.out.println("Enter 3 to play with all the pets");
        System.out.println("Enter 4 to remove a pet");
        System.out.println("Enter 5 to add a pet");
        System.out.println("Enter 6 to oil Robotic pets");
        System.out.println("Enter 7 to maintain Robotic pets");
        System.out.println("Enter 8 to walk all Dogs");
        System.out.println("Enter 9 to use the laser pointer with all Cats");
        System.out.println("To leave the adoption agency, please type \"Quit\"");
        String userInput = inputScanner.nextLine();
        while (!userInput.equalsIgnoreCase("quit")) {
            if (userInput.equalsIgnoreCase("1")) {
                shelter.feedAllOrganicPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("2")) {
                shelter.waterAllOrganicPets();
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
            if (userInput.equalsIgnoreCase("6")) {
                shelter.oilAllRoboticPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("7")) {
                shelter.maintainAllRoboticPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("8")) {
                for (VirtualPet petToWalk : shelter.retrievePets())
                    if (petToWalk instanceof RoboDogs) {
                        ((RoboDogs) petToWalk).walk();
                        shelter.tickAllPets();
                    }
            }
            if (userInput.equalsIgnoreCase("8")) {
                for (VirtualPet petToWalk : shelter.retrievePets())
                    if (petToWalk instanceof OrganicDog) {
                        ((OrganicDog) petToWalk).walk();
                        shelter.tickAllPets();
                    }
            }
                if (userInput.equalsIgnoreCase("9")) {
                    for (VirtualPet petToLaserPointer : shelter.retrievePets())
                        if (petToLaserPointer instanceof OrganicCats) {
                            ((OrganicCats) petToLaserPointer).pointLaser();
                            shelter.tickAllPets();
                        }
                }
            if (userInput.equalsIgnoreCase("9")) {
                for (VirtualPet petToLaserPointer : shelter.retrievePets())
                    if (petToLaserPointer instanceof RoboCats) {
                        ((RoboCats) petToLaserPointer).pointLaser();
                        shelter.tickAllPets();
                    }
            }
                    for (VirtualPet petToDisplay : shelter.retrievePets()) {
                        System.out.println(petToDisplay);
                    }
                    System.out.println("Enter 1 to feed the organic pets ");
                    System.out.println("Enter 2 to give water to the organic pets ");
                    System.out.println("Enter 3 to play with all the pets");
                    System.out.println("Enter 4 to remove a pet ");
                    System.out.println("Enter 5 to add a pet ");
                    System.out.println("Enter 6 to oil robotic pets ");
                    System.out.println("Enter 7 to maintain robotic pets ");
                    System.out.println("Enter 8 to walk all dogs");
                    System.out.println("Enter 9 to walk all Organic dogs");
                    System.out.println("Enter 10 to use the laser pointer with all cats");
                    userInput = inputScanner.nextLine();
                }
            }

        }







