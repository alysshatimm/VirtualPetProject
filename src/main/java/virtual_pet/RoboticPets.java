package virtual_pet;

public class RoboticPets extends VirtualPet {
    private int oilLevel = 10;
    private int wearAndTear = 10;

    public RoboticPets(String name, int boredom, int oilLevel, int wearAndTear) {
        super(name, boredom);
        this.oilLevel = oilLevel;
        this.wearAndTear = wearAndTear;
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getBoredom() {
        return super.getBoredom();
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getWearAndTear() {
        return wearAndTear;
    }

    public void tick() {
        oilLevel += 2;
        wearAndTear += 2;
    }
    public void oil(){
        oilLevel -= 10;
        if (oilLevel <= 0) {
            oilLevel = 0;
        }
    }
    public void maintenance(){
        wearAndTear -= 10;
        if (wearAndTear <= 0) {
            wearAndTear = 0;
        }
    }
//    @Override
//    public String toString() {
//        return name + " | Oil Level: " + oilLevel + " | Wear and Tear: " + wearAndTear + " | Boredom: " + boredom;
//    }
}


