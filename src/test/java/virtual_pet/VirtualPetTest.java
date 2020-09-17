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
        VirtualPet underTest = new VirtualPet("Sally");

        int result = underTest.getBoredom();

//        assertEquals();
    }
}
