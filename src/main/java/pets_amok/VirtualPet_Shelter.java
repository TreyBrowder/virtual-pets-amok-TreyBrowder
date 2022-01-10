package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPet_Shelter {

    //keyValue: pet name value: pet object
    Map<String, Virtual_Pet> myShelter = new HashMap<>();

    //remove pet object out of hashmap
    public void petAdoption(String petName) {
        Virtual_Pet myPet = findPetName(petName);
        myShelter.remove(myPet.getName());
    }

    //add a pet into hashmap
    public void takeInPet(Virtual_Pet petToAdd) {

        myShelter.put(petToAdd.getName(), petToAdd);
    }

    //getter for to return Key value(pet name)
    public Virtual_Pet findPetName(String petName) {

        return myShelter.get(petName);
    }

    //getter to return all items in the hashmap
    public Collection<Virtual_Pet> getAllPets() {

        return myShelter.values();
    }

    //methods of behavior************

    //feed or oil all pets in hash map
    public void feedAllPets() {

        for(Virtual_Pet petObj : myShelter.values()){
            if(petObj instanceof Organic_Dog){
                //feed dog
                ((Organic_Dog) petObj).giveFood();
            }else if(petObj instanceof Organic_Cat){
                //feed cat
                ((Organic_Cat) petObj).giveFood();
            }else if(petObj instanceof Robo_Cat){
                //give oil to robo cat
                ((Robo_Cat) petObj).giveOil();
            }else if(petObj instanceof Robo_Dog){
                //give oil to robo dog
                ((Robo_Dog) petObj).giveOil();

            }
        }

    }

    //water all pets in hash map
    public void waterAllPets() {

        for (Virtual_Pet petObj : myShelter.values()) {
            if (petObj instanceof Organic_Dog){
                //water dog
                ((Organic_Dog) petObj).giveWater();
            } else if (petObj instanceof Organic_Cat){
                //water cat
                ((Organic_Cat) petObj).giveWater();
            }
        }
    }

    //oil all pets in hash map
    public void OilAllPets() {
        for (Virtual_Pet petObj : myShelter.values()) {
            if (petObj instanceof Robo_Dog){
                //oil dog
                ((Robo_Dog) petObj).giveOil();
            }else if (petObj instanceof Robo_Cat){
                //oil cat
                ((Robo_Dog) petObj).giveOil();
            }
        }
    }

    //clean all dog cages in hash map
    public void CleanAllDogCages() {

        for (Virtual_Pet petObj : myShelter.values()) {
            if (petObj instanceof Organic_Dog){
                //increase health and happiness
                ((Organic_Dog) petObj).cleanDogCage();
            } else if (petObj instanceof Robo_Dog){
                //increase health and happiness
                ((Robo_Dog) petObj).cleanDogCage();
            }
        }
    }

    //clean all LitterBoxes in hash map
    public void CleanAllLitterBoxes() {

        for (Virtual_Pet petObj : myShelter.values()) {
            if (petObj instanceof Organic_Cat){
                //increase health and happiness
                ((Organic_Cat) petObj).cleanLitter();
            } else if (petObj instanceof Robo_Cat){
                //increase health and happiness
                ((Robo_Cat) petObj).cleanLitter();
            }
        }
    }

    public void WalkAllDogs(){
        for (Virtual_Pet petObj : myShelter.values()) {
            if (petObj instanceof Organic_Dog){
                //increase health and decrease bored, bathroom
                ((Organic_Dog) petObj).walkDog();
            } else if (petObj instanceof Robo_Dog){
                //increase health and decrease bored, oil level
                ((Robo_Dog) petObj).walkDog();
            }
        }
    }

    public void showAllPets() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Name", "Description", "Happiness", "Health", "Boredom");
        for(Virtual_Pet myPet : myShelter.values()){
            System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",myPet.getName(), myPet.getDescription(),
                    myPet.getHappiness(), myPet.getHealth(), myPet.getBored());
        }
    }

    public void controlPetStats(){
        for(Virtual_Pet myPet: myShelter.values()){
            myPet.petStatus();
        }
    }

    public void getWasteLevels(){
        for(Virtual_Pet petObj: myShelter.values()){
           //iterate through each pet obj and print out the wastelevel
            System.out.println("waste level for all pets:");
            System.out.println(petObj.getName() + " waste Level in cage: " + petObj.getWasteLevel());
        }
    }

}
