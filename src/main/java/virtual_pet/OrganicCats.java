package virtual_pet;

public class OrganicCats extends OrganicPets implements LaserPointer{
    public OrganicCats(String name, int hunger, int thirst, int boredom) {
        super(name, hunger, thirst, boredom);
    }

    @Override
    public void pointLaser() {
        boredom -= 5;
    }
}
