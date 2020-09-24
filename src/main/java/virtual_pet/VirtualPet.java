package virtual_pet;

public abstract class VirtualPet {
    private int boredom = 10;
    private String name;

    public VirtualPet(String name, int boredom) {
        this.name = name;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }

    public int getBoredom() {
        return boredom;
    }

    public void tick() {
        boredom += 2;
    }

    public void play() {
        boredom -= 10;
        if (boredom <= 0) {
            boredom = 0;
        }
    }

//@Override
//    public String toString(){
//        return name + " | Hunger: " + hunger + " | Thirst: " + thirst + " | Boredom: " + boredom;
//}

}
