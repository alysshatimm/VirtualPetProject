package virtual_pet;

public class OrganicPets extends VirtualPet {
    private int hunger = 10;
    private int thirst = 10;

    public OrganicPets(String name, int hunger, int thirst, int boredom) {
        super(name, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHunger() {
        return hunger;
    }

    public void tick() {
        hunger += 2;
        thirst += 2;
    }

    public void feed() {
        hunger -= 10;
        if (hunger <= 0) {
            hunger = 0;
        }
    }

    public void water() {
        thirst -= 10;
        if (thirst <= 0) {
            thirst = 0;
        }
    }

//    @Override
//    public String toString() {
//        return name + " | Hunger: " + hunger + " | Thirst: " + thirst + " | Boredom: " + boredom;
//    }
}
