package virtual_pet;

import java.util.ArrayList;
import java.util.Collection;

public class VirtualPetShelter {
    private int initialPetsAvailable = 0;
    private Collection<VirtualPet> petsForAdoption = new ArrayList<>();
    public Collection<VirtualPet> listPets() {

        VirtualPet Jeff = new VirtualPet("Jeff", 10, 10, 10);
        VirtualPet Steve = new VirtualPet("Steve",8,7,5);
        VirtualPet Charlie = new VirtualPet("Charlie", 15, 20, 30);
        VirtualPet Daisy = new VirtualPet("Daisy", 12, 7, 25);
        VirtualPet Kendrick = new VirtualPet("Kendrick", 56,83,32);
        VirtualPet Alex = new VirtualPet("Alex", 32,14,8);
        VirtualPet Lucinda = new VirtualPet("Lucinda", 99,99,99);
        VirtualPet Sally = new VirtualPet("Sally", 10 ,10 ,10);
        VirtualPet George = new VirtualPet("George",120,100,2);
        VirtualPet Frank = new VirtualPet("Frank", 589,0,758);


        petsForAdoption.add(Jeff);
        petsForAdoption.add(Steve);
        petsForAdoption.add(Charlie);
        petsForAdoption.add(Daisy);
        petsForAdoption.add(Kendrick);
        petsForAdoption.add(Alex);
        petsForAdoption.add(Lucinda);
        petsForAdoption.add(Sally);
        petsForAdoption.add(George);
        petsForAdoption.add(Frank);
        return petsForAdoption;

        }

    public int initialPetsAvailable() {
        return initialPetsAvailable;
    }
    public void addPets(){
        initialPetsAvailable += 1;
    }


}
