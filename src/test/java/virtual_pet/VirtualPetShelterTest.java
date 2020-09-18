package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VirtualPetShelterTest {
    @Test
    public void initialPetsAvailable(){
        VirtualPetShelter underTest = new VirtualPetShelter();

        int result = underTest.initialPetsAvailable();

        assertEquals(0, result);

    }   @Test
    public void shouldIntakePets(){
        VirtualPetShelter underTest = new VirtualPetShelter();

        int initialPetsAvailable = underTest.initialPetsAvailable();
        underTest.addPets();
        int petsAfterIntake = underTest.initialPetsAvailable();

        assertEquals(initialPetsAvailable + 1, petsAfterIntake);
    }
    @Test
    public void shouldDisplayPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();

        String virtualPetsAvailable = underTest.getVirtualPet();

        assertNotEquals(virtualPetsAvailable, null);


    }

}
