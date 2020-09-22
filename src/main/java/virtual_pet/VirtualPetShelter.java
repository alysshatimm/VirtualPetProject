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
    public void feedAllPets() {
        for (VirtualPet petToFeed : pets.values()) {
            petToFeed.feed();
        }
    }

    //water
    public void waterAllPets() {
        for (VirtualPet petToWater : pets.values()) {
            petToWater.water();
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
