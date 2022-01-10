package pets_amok;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //create all virtual pet objects
        Scanner userInput = new Scanner(System.in);

        VirtualPet_Shelter myShelter = new VirtualPet_Shelter();
        Virtual_Pet pet1 = new Organic_Cat("roxy", "black", 50, 50, 50, 50, 50, 50, 50, 0);
        Virtual_Pet pet2 = new Organic_Dog("max", "white", 50, 50, 50, 50, 50, 50, 0);
        Virtual_Pet pet3 = new Robo_Cat("tim", "rusty", 50, 50,50, 50, 50, 0);
        Virtual_Pet pet4 = new Robo_Dog("fido", "chocolate", 50, 50, 50, 50, 50, 0);

        myShelter.takeInPet(pet1);
        myShelter.takeInPet(pet2);
        myShelter.takeInPet(pet3);
        myShelter.takeInPet(pet4);

        System.out.println("WELCOME TO VIRTUAL PET!");
        System.out.println();

        String gameOptChoice;

        do{
            System.out.println("Here is the status of all pets with us today:");
            myShelter.showAllPets();
            System.out.println();

            System.out.println("Please enter a number from the options below:");
            System.out.println();
            System.out.println("1. Feed all pets that require food");
            System.out.println("2. give oil to pets that require oil");
            System.out.println("3. give water to all pets that require water");
            System.out.println("4. to add a new pet to the shelter");
            System.out.println("5. to adopt a pet out of the shelter");
            System.out.println("6. to walk all the dogs");
            System.out.println("7. to clean dog cages");
            System.out.println("8 to clean all the cat litter");
            System.out.println("9. exit");
            gameOptChoice = userInput.nextLine();

            if(gameOptChoice.equals("1")){
                //feed pets
                myShelter.feedAllPets();
                System.out.println("all pets that require food have been feed");
                myShelter.showAllPets();
            }else if(gameOptChoice.equals("2")){
                //oil pets;
                myShelter.OilAllPets();
                System.out.println("all pets that require oil have been oiled");
                myShelter.showAllPets();
            }else if(gameOptChoice.equals("3")){
                //give pets water
                myShelter.waterAllPets();
                System.out.println("all pets that require water have been quenched of there thirst");
                myShelter.showAllPets();
            }else if(gameOptChoice.equals("4")){

                boolean flag = true;
                System.out.println("you chose to add a new pet to the shelter.");
                System.out.println("do want a robo or organic pet?");
                String petType = userInput.nextLine();
                System.out.println("do you want a cat or dog?");
                String petSpecies = userInput.nextLine();
                System.out.println("What do you want to name your new " + petType + " " + petSpecies + "?");
                String newPetName = userInput.next();
            do {
                if (petType.equals("organic")) {
                    if (petSpecies.equals("cat")) {
                        Virtual_Pet newPet = new Organic_Cat(newPetName, "black",
                                50, 50, 50, 50, 50, 50, 50, 0);
                        myShelter.takeInPet(newPet);
                        myShelter.showAllPets();
                        flag = false;
                    } else {
                        Virtual_Pet newPet = new Organic_Dog(newPetName, "black",
                                50, 50, 50, 50, 50, 50, 0);
                        myShelter.takeInPet(newPet);
                        myShelter.showAllPets();
                        flag = false;
                    }
                } else if (petType.equals("robo")) {
                    if (petSpecies.equals("cat")) {
                        Virtual_Pet newPet = new Robo_Cat(newPetName, "black",
                                50, 50, 50, 50, 50, 0);
                        myShelter.takeInPet(newPet);
                        myShelter.showAllPets();
                        flag = false;
                    } else {
                        Virtual_Pet newPet = new Robo_Dog(newPetName, "rusty", 50,
                                50, 50, 50, 50, 0);
                        myShelter.takeInPet(newPet);
                        myShelter.showAllPets();
                        flag = false;
                    }
                } else {
                    System.out.println("invalid choice... you've been kicked out");
                }
            }while(flag);

            }else if(gameOptChoice.equals("5")){
                //remove pet
                System.out.println("you chose to adopt a pet!");
                System.out.println("please type in the name of pet you want to adopt: ");
                myShelter.showAllPets();

                String petChoice = userInput.nextLine();
                myShelter.petAdoption(petChoice);
                myShelter.showAllPets();

            }else if(gameOptChoice.equals("6")){
                //walk all dogs
                System.out.println("you chose to walk all dogs!");

                myShelter.WalkAllDogs();
                System.out.println("All dogs have been walked!");
                myShelter.showAllPets();

            }else if(gameOptChoice.equals("7")){
                System.out.println("You chose to clean all dog cages!");
                myShelter.CleanAllDogCages();
                System.out.println("all dog cages have been cleaned!");
                myShelter.showAllPets();
            }else if(gameOptChoice.equals("8")){
                System.out.println("You chose to clean all cat's litter");
                myShelter.CleanAllLitterBoxes();;
                myShelter.showAllPets();
            }

            myShelter.getWasteLevels();
            myShelter.controlPetStats();

        }while(!gameOptChoice.equals("9"));
        System.out.println("Thanks for coming in today!!");

    }

}
