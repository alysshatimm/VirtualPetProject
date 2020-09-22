package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualPetShelterTest {

    @Test
    public void shouldBeAbleToAddPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Frank",10,10,10);
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                        .contains(testPet);
    }
    @Test
    public void shouldBeAbleToRemovePet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Frank",10,10,10);
        underTest.addPet(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                        .isEmpty();
    }
    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Jeff",10,10,10);
        VirtualPet anotherTestPet = new VirtualPet("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.feedAllPets();

        assertThat(testPet.getHunger()).isEqualTo(5);
        assertThat(anotherTestPet.getHunger()).isEqualTo(5);
    }
    @Test
    public void shouldBeAbleToPlayWithAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Jeff",10,10,10);
        VirtualPet anotherTestPet = new VirtualPet("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.playWithAllPets();

        assertThat(testPet.getBoredom()).isEqualTo(5);
        assertThat(anotherTestPet.getBoredom()).isEqualTo(5);
    }
    @Test
    public void shouldBeAbleToWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Jeff",10,10,10);
        VirtualPet anotherTestPet = new VirtualPet("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.waterAllPets();

        assertThat(testPet.getThirst()).isEqualTo(5);
        assertThat(anotherTestPet.getThirst()).isEqualTo(5);
    }
//    @Test
//    public void shouldTickAllPets(){
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        VirtualPet testPet = new VirtualPet("Jeff",10,10,10);
//        VirtualPet anotherTestPet = new VirtualPet("Tester",10,10,10);
//        underTest.addPet(testPet);
//        underTest.addPet(anotherTestPet);
//
//        underTest.tickAllPets();
//
//        assertThat(testPet.tick()).isEqualTo(20);
//
//    }
}
