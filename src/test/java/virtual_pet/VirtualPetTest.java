package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new VirtualPet("Test Name");
    }

    @Test
    public void petShouldHaveName(){
        VirtualPet underTest = new VirtualPet("Jeff");

        String result = underTest.getName();

        assertEquals("Jeff", result);
    }

  @Test
    public void shouldHaveDefaultHunger(){
        VirtualPet underTest = new VirtualPet("Steve");

        int result = underTest.getHunger();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultThirst(){
        VirtualPet underTest = new VirtualPet("Charlie");

        int result = underTest.getThirst();

        assertEquals(10, result);
    }

    @Test
    public void shouldHaveDefaultBoredom(){
        VirtualPet underTest = new VirtualPet("Daisy");

        int result = underTest.getBoredom();

        assertEquals(10, result);
    }
    @Test
    public void shouldTick() {
        VirtualPet  underTest = new VirtualPet("Kendrick");

        int result = underTest.getHunger();
        underTest.tick();
        int hungerAfterTick = underTest.getHunger();

        assertEquals(result + 10, hungerAfterTick);
    }
    @Test
    public void shouldPlay(){
        //Arrangement
        VirtualPet underTest = new VirtualPet("Sally");

        int initalBoredom = underTest.getBoredom();
        //Action
        underTest.petPlay();
        //Assertion
        int boredomAfterPlay = underTest.getBoredom();

       assertEquals(initalBoredom - 5, boredomAfterPlay);
    }
    @Test
    public void shouldFeed(){
        VirtualPet underTest = new VirtualPet("George");

        int initalHunger = underTest.getHunger();
        underTest.petFeed();
        int hungerAfterFeed = underTest.getHunger();

        assertEquals(initalHunger - 5, hungerAfterFeed);

    }
    @Test
    public void shouldWater(){
        VirtualPet underTest = new VirtualPet("Frank");

        int initalThirst = underTest.getThirst();
        underTest.petWater();
        int thirstAfterWater = underTest.getThirst();

        assertEquals(initalThirst - 5, thirstAfterWater);
    }
    @Test
    public void neverNegativeBoredom(){
        VirtualPet underTest = new VirtualPet("Janice");

        for(int i = 0; i< 1000; i++){
            underTest.petPlay();
        }
        int boredom = underTest.getBoredom();

        assertEquals(0  , boredom);
    }
}
