package virtual_pet;

public class RoboCats extends RoboticPets implements LaserPointer {
    public RoboCats(String name, int boredom, int oilLevel, int wearAndTear) {
        super(name, boredom, oilLevel, wearAndTear);
    }

    @Override
    public void pointLaser() {
        boredom -= 5;
    }
}
