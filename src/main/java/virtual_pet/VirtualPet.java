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
        hunger += 2;
        thirst += 2;
        boredom += 2;
    }

    public void play() {
        boredom -= 10;
        if (boredom <= 0) {
            boredom = 0;
        }
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
@Override
    public String toString(){
        return name + " | Hunger: " + hunger + " | Thirst: " + thirst + " | Boredom: " + boredom;
}

}
