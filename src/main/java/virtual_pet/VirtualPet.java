package virtual_pet;

public class VirtualPet {
    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;
    private String name;

    public VirtualPet(String name, int hunger, int thirst, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHunger() {
        return hunger;
    }

    public void tick() {
        hunger += 10;
        thirst += 10;
        boredom += 10;
    }

    public void play() {
        boredom -= 5;
        if (boredom <= 0) {
            boredom = 0;
        }
    }

    public void feed() {
        hunger -= 5;
        if (hunger <= 0) {
            hunger = 0;
        }
    }

    public void water() {
        thirst -= 5;
        if (thirst <= 0) {
            thirst = 0;
        }
    }


}
