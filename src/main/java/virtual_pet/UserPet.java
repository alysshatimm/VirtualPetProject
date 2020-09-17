package virtual_pet;

import java.util.Scanner;

public class UserPet {




//    public VirtualPet(String name, int hunger, int thirst, int boredom){
//
//            this.name = name;
//            this.hunger = hunger;
//            this.thirst = thirst;
//            this.boredom = boredom;

        public void greeting() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to the AKM Virtual Pet Adoption Agency!");
        System.out.println("Please give your new pet a name:");
        String name= inputScanner.nextLine();
        System.out.println("You entered: " + name);
        }
//        public String getName () {
//            name = "Jeff";
//            return name;
//        }
//
//        public int getHunger () {
//            return hunger;
//        }
//
//        public int getThirst () {
//            return thirst;
//        }
//
//        public int getBoredom () {
//            return boredom;
//        }
    }




