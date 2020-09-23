package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        VirtualPetShelter shelter = new VirtualPetShelter();
        VirtualPet Jeff = new VirtualPet("Jeff", 10, 10, 10);
        VirtualPet Steve = new VirtualPet("Steve", 8, 7, 5);
        VirtualPet Charlie = new VirtualPet("Charlie", 15, 20, 30);
        VirtualPet Daisy = new VirtualPet("Daisy", 12, 7, 25);
        VirtualPet Kendrick = new VirtualPet("Kendrick", 56, 83, 32);
        VirtualPet Alex = new VirtualPet("Alex", 32, 14, 8);
        VirtualPet Lucinda = new VirtualPet("Lucinda", 99, 99, 99);
        VirtualPet Sally = new VirtualPet("Sally", 10, 10, 10);
        VirtualPet George = new VirtualPet("George", 120, 100, 2);
        VirtualPet Frank = new VirtualPet("Frank", 589, 0, 758);
        shelter.addPet(Frank);
        shelter.addPet(Jeff);
        shelter.addPet(Steve);
        shelter.addPet(Charlie);
        shelter.addPet(Daisy);
        shelter.addPet(Kendrick);
        shelter.addPet(Alex);
        shelter.addPet(Lucinda);
        shelter.addPet(Sally);
        shelter.addPet(George);


        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the AKM Virtual Pet Adoption Agency!");
        System.out.println("Here are the available pets for adoption:");

        for (VirtualPet petToDisplay : shelter.retrievePets()){
            System.out.println(petToDisplay);
        }
        System.out.println("instructions");
        System.out.println("Enter 1 to feed all the pets ");
        System.out.println("Enter 2 to give water to all the pets ");
        System.out.println("Enter 3 to play with all the pets");
        System.out.println("Enter 4 to remove a pet ");
        System.out.println("Enter 5 to add a pet ");
        String userInput = inputScanner.nextLine();
        while (!userInput.equalsIgnoreCase("quit")){
            if (userInput.equalsIgnoreCase("1")){
                shelter.feedAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("2")){
                shelter.waterAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("3")){
                shelter.playWithAllPets();
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("4")){
                System.out.println("Which pet would you like to remove?");
                String petNameToRemove = inputScanner.nextLine();
                shelter.removePet(petNameToRemove);
                shelter.tickAllPets();
            }
            if (userInput.equalsIgnoreCase("5")){
                System.out.println("Which pet would you like to add?");
                String petNameToAdd = inputScanner.nextLine();
                shelter.addPet(petNameToAdd);
            }
        }

        //use scanner to get user feedback
//        while("something is true".equals("!")){
//
//        }
//    }
//
//    public void greeting() {

//        System.out.println("Please give your new pet a name:");
//        String name = inputScanner.nextLine();
//        System.out.println("You entered: " + name);
//        System.out.println("The pets available for adoption are:" +);
//    }

    }
}




