package virtual_pet;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    public Map<String, VirtualPet> pets = new HashMap<>();

    //Add
    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }

    //remove
    public void removePet(String petName) {
        pets.remove(petName);
    }

    //play
    public void playWithAllPets() {
        for (VirtualPet petToPlay : pets.values()) {
            petToPlay.play();
        }
    }

    //feed
    public void feedAllOrganicPets() {
        for (VirtualPet petToFeed : pets.values()) {
            if (petToFeed instanceof OrganicPets) {
                ((OrganicPets) petToFeed).feed();
            }

        }
    }

    //water
    public void waterAllOrganicPets() {
        for (VirtualPet petToWater : pets.values()) {
            if (petToWater instanceof OrganicPets) {
                ((OrganicPets) petToWater).water();
            }
        }
    }

    public void oilAllRoboticPets() {
        for (VirtualPet petToOil : pets.values()) {
            if (petToOil instanceof RoboticPets) {
                ((RoboticPets) petToOil).oil();
            }
        }
    }

    public void maintainAllRoboticPets() {
        for (VirtualPet petToMaintain : pets.values()) {
            if (petToMaintain instanceof RoboticPets) {
                ((RoboticPets) petToMaintain).maintenance();
            }
        }
    }


    //tick
    public void tickAllPets() {
        for (VirtualPet petToTick : pets.values()) {
            petToTick.tick();
        }
    }

    //retrievePets
    public Collection<VirtualPet> retrievePets() {
        return pets.values();
    }

    //retrievePet
    public VirtualPet retrievePet(String petName) {
        return pets.get(petName);
    }


}
