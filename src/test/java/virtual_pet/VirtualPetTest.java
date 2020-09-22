package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test name", 10, 10, 10);
    }

    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new VirtualPet("Jeff", 10, 10, 10);

        String result = underTest.getName();

        assertEquals("Jeff", result);
    }

    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new VirtualPet("Steve", 10, 10, 10);

        int result = underTest.getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new VirtualPet("Charlie", 10, 10, 10);

        int result = underTest.getThirst();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultBoredom() {
        VirtualPet underTest = new VirtualPet("Daisy", 10, 10, 10);

        int result = underTest.getBoredom();

        assertEquals(10, result);
    }

    @Test
    public void hungerTick() {
        VirtualPet underTest = new VirtualPet("Kendrick", 10, 10, 10);

        int result = underTest.getHunger();
        underTest.tick();
        int hungerAfterTick = underTest.getHunger();

        assertEquals(result + 10, hungerAfterTick);
    }

    @Test
    public void thirstTick() {
        VirtualPet underTest = new VirtualPet("Alex", 10, 10, 10);

        int result = underTest.getThirst();
        underTest.tick();
        int thirstAfterTick = underTest.getThirst();

        assertEquals(result + 10, thirstAfterTick);
    }

    @Test
    public void boredomTick() {
        VirtualPet underTest = new VirtualPet("Lucinda", 10, 10, 10);

        int result = underTest.getBoredom();
        underTest.tick();
        int boredomAfterTick = underTest.getBoredom();

        assertEquals(result + 10, boredomAfterTick);
    }

    @Test
    public void shouldPlay() {
        //Arrangement
        VirtualPet underTest = new VirtualPet("Sally", 10, 10, 10);

        int initalBoredom = underTest.getBoredom();
        //Action
        underTest.play();
        //Assertion
        int boredomAfterPlay = underTest.getBoredom();

        assertEquals(initalBoredom - 5, boredomAfterPlay);
    }

    @Test
    public void shouldFeed() {
        VirtualPet underTest = new VirtualPet("George", 10, 10, 10);

        int initalHunger = underTest.getHunger();
        underTest.feed();
        int hungerAfterFeed = underTest.getHunger();

        assertEquals(initalHunger - 5, hungerAfterFeed);

    }

    @Test
    public void shouldWater() {
        VirtualPet underTest = new VirtualPet("Frank", 10, 10, 10);

        int initalThirst = underTest.getThirst();
        underTest.water();
        int thirstAfterWater = underTest.getThirst();

        assertEquals(initalThirst - 5, thirstAfterWater);
    }

    @Test
    public void neverNegativeBoredom() {
        VirtualPet underTest = new VirtualPet("Janice", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            underTest.play();
        }
        int boredom = underTest.getBoredom();

        assertEquals(0, boredom);
    }

    @Test
    public void neverNegativeHunger() {
        VirtualPet underTest = new VirtualPet("Robert", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            underTest.feed();
        }
        int hunger = underTest.getHunger();

        assertEquals(0, hunger);
    }

    @Test
    public void neverNegativeThirst() {
        VirtualPet underTest = new VirtualPet("Gabby", 10, 10, 10);

        for (int i = 0; i < 1000; i++) {
            underTest.water();
        }
        int thirst = underTest.getThirst();

        assertEquals(0, thirst);
    }
}
