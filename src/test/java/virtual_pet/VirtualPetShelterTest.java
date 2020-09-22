package virtual_pet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualPetShelterTest {

    private VirtualPetShelter underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPetShelter();
    }


    @Test
    public void shouldAddPets() {
        VirtualPet petToAdd = new VirtualPet("Jeff", 10, 10, 10);

        underTest.addPets(petToAdd);
    }

    @Test
    public void shouldListAllPets() {

        underTest.listPets();

        Collection<VirtualPet> petsForAdoption = underTest.listPets();

        assertThat(petsForAdoption).extracting(VirtualPet::getName);
    }

}
