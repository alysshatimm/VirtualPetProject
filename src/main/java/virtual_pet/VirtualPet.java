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

    public void petPlay() {
        boredom -= 5;
        if (boredom <= 0) {
            boredom = 0;
        }
    }

    public void petFeed() {
        hunger -= 5;
        if ( hunger <= 0){
            hunger = 0;
        }
    }

    public void petWater() {
       thirst -= 5;
       if (thirst <= 0){
           thirst = 0;
       }
    }


}
