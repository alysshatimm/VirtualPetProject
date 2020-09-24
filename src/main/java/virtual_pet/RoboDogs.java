package virtual_pet;

public class RoboDogs extends RoboticPets implements Walking {
    private static int oilLevel;
    private static int wearAndTear;

    public RoboDogs(String name, int boredom, int oilLevel, int wearAndTear) {
        super(name, boredom, oilLevel, wearAndTear);
    }

    @Override
    public void walk() {
        RoboDogs.oilLevel -= 10;
        if (oilLevel <= 0) {
            oilLevel = 0;
        }
        RoboDogs.wearAndTear += 10;
        if (wearAndTear <= 0){
            wearAndTear = 0;
        }
    }
}
