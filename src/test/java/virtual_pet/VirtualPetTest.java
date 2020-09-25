package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new OrganicPets("Test name", 10, 10, 10);
        VirtualPet roboPet = new RoboticPets("Test name 2", 10, 10, 10);
    }

    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new OrganicPets("Jeff", 10, 10, 10);
        VirtualPet underTest2 = new RoboticPets("roboJeff", 10, 10, 10);

        String result = underTest.getName();
        String result2 = underTest2.getName();

        assertEquals("Jeff", result);
        assertEquals("roboJeff", result2);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new OrganicPets("Steve", 10, 10, 10);

        int result = ((OrganicPets) underTest).getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new OrganicPets("Charlie", 10, 10, 10);

        int result = ((OrganicPets) underTest).getThirst();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new RoboticPets("roboDaisy", 10, 10, 10);

        int result = underTest.getBoredom();

        assertEquals(10, result);
    }

    @Test
    public void hungerTick() {
        VirtualPet underTest = new OrganicPets("Kendrick", 10, 10, 10);

        int result = ((OrganicPets) underTest).getHunger();
        underTest.tick();
        int hungerAfterTick = ((OrganicPets) underTest).getHunger();

        assertEquals(result + 2, hungerAfterTick);
    }

    @Test
    public void thirstTick() {
        VirtualPet underTest = new OrganicPets("Alex", 10, 10, 10);

        int result = ((OrganicPets) underTest).getThirst();
        underTest.tick();
        int thirstAfterTick = ((OrganicPets) underTest).getThirst();

        assertEquals(result + 2, thirstAfterTick);
    }

    @Test
    public void boredomTick() {
        VirtualPet underTest = new OrganicPets("Lucinda", 10, 10, 10);

        int result = underTest.getBoredom();
        underTest.tick();
        int boredomAfterTick = underTest.getBoredom();

        assertEquals(result + 2, boredomAfterTick);
    }

    @Test
    public void shouldPlay() {
        //Arrangement
        VirtualPet underTest = new RoboticPets("roboSally", 10, 10, 10);

        int initalBoredom = underTest.getBoredom();
        //Action
        underTest.play();
        //Assertion
        int boredomAfterPlay = underTest.getBoredom();

        assertEquals(initalBoredom - 10, boredomAfterPlay);
    }

    @Test
    public void shouldFeed() {
        VirtualPet underTest = new OrganicPets("George", 10, 10, 10);

        int initalHunger = ((OrganicPets) underTest).getHunger();
        ((OrganicPets) underTest).feed();
        int hungerAfterFeed = ((OrganicPets) underTest).getHunger();

        assertEquals(initalHunger - 10, hungerAfterFeed);

    }

    @Test
    public void shouldWater() {
        VirtualPet underTest = new OrganicPets("Frank", 10, 10, 10);

        int initalThirst = ((OrganicPets) underTest).getThirst();
        ((OrganicPets) underTest).water();
        int thirstAfterWater = ((OrganicPets) underTest).getThirst();

        assertEquals(initalThirst - 10, thirstAfterWater);
    }

    @Test
    public void neverNegativeBoredom() {
        VirtualPet underTest = new RoboticPets("roboJanice", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            underTest.play();
        }
        int boredom = underTest.getBoredom();

        assertEquals(0, boredom);
    }

    @Test
    public void neverNegativeHunger() {
        VirtualPet underTest = new OrganicPets("Robert", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            ((OrganicPets) underTest).feed();
        }
        int hunger = ((OrganicPets) underTest).getHunger();

        assertEquals(0, hunger);
    }

    @Test
    public void neverNegativeThirst() {
        VirtualPet underTest = new OrganicPets("Gabby", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            ((OrganicPets) underTest).water();
        }
        int thirst = ((OrganicPets) underTest).getThirst();

        assertEquals(0, thirst);
    }

    @Test
    public void neverNegativeWearAndTear() {
        VirtualPet underTest = new RoboticPets("Gabby", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            ((RoboticPets) underTest).maintenance();
        }
        int wearAndTear = ((RoboticPets) underTest).getWearAndTear();

        assertEquals(0, wearAndTear);
    }
}
