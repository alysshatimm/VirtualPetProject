package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    private VirtualPetShelter underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPetShelter();
    }

    @Test
    public void initialPetsAvailable() {

        int result = underTest.initialPetsAvailable();

        assertEquals(0, result);

    }

    @Test
    public void shouldIntakePets() {

        int initialPetsAvailable = underTest.initialPetsAvailable();
        underTest.addPets();
        int petsAfterIntake = underTest.initialPetsAvailable();

        assertEquals(initialPetsAvailable + 1, petsAfterIntake);
    }

    @Test
    public void shouldListAllPets() {

        underTest.listPets();

        Collection<VirtualPet> petsForAdoption = underTest.listPets();

        assertThat(petsForAdoption).extracting(VirtualPet::getName);
    }

}
