package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualPetShelterTest {

    @Test
    public void shouldBeAbleToAddPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicPets("Frank",10,10,10);
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                        .contains(testPet);
    }
    @Test
    public void shouldBeAbleToRemovePet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new RoboticPets("Frank",10,10,10);
        underTest.addPet(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                        .isEmpty();
    }
    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicPets("Jeff",10,10,10);
        VirtualPet anotherTestPet = new OrganicPets("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.feedAllPets();

        assertThat(((OrganicPets) testPet).getHunger()).isEqualTo(0);
        assertThat(((OrganicPets) anotherTestPet).getHunger()).isEqualTo(0);
    }
    @Test
    public void shouldBeAbleToPlayWithAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new RoboticPets("Jeff",10,10,10);
        VirtualPet anotherTestPet = new OrganicPets("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.playWithAllPets();

        assertThat(testPet.getBoredom()).isEqualTo(0);
        assertThat(anotherTestPet.getBoredom()).isEqualTo(0);
    }
    @Test
    public void shouldBeAbleToWaterAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicPets("Jeff",10,10,10);
        VirtualPet anotherTestPet = new OrganicPets("Tester",10,10,10);
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.waterAllPets();

        assertThat(((OrganicPets) testPet).getThirst()).isEqualTo(0);
        assertThat(((OrganicPets) anotherTestPet).getThirst()).isEqualTo(0);
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
