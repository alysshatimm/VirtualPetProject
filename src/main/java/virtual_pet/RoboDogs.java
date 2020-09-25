package virtual_pet;

public class RoboDogs extends RoboticPets implements Walking {

    public RoboDogs(String name, int boredom, int oilLevel, int wearAndTear) {
        super(name, boredom, oilLevel, wearAndTear);
    }

    @Override
    public void walk() {
        oilLevel -= 10;
        wearAndTear += 10;
        }
    }

