package virtual_pet;

public class VirtualPet {
    private int hunger = 10;
    private int thirst = 10;
    private int boredom = 10;

    public VirtualPet(String name) {
    }
    public String getName() {
        return "Jeff";
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getHunger(){
        return hunger;
    }
    public void tick() {
        hunger += 10;
    }
}
