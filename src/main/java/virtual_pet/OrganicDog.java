package virtual_pet;

public class OrganicDog extends OrganicPets implements Walking {
    public OrganicDog(String name, int hunger, int thirst, int boredom) {
        super(name, hunger, thirst, boredom);
    }

    @Override
    public void walk() {

    }
}
