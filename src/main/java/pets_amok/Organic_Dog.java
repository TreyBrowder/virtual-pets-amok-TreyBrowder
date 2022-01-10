package pets_amok;

public class Organic_Dog extends Organic_Pet {


    Organic_Dog(String name, String description, int happiness, int health, int bathroom, int bored, int wasteLevel,int thirst, int hunger) {
        super(name, description, happiness, health, bathroom, bored, wasteLevel, thirst, hunger);
    }

    //getter
    int getWasteLevel(){
        return wasteLevel;
    }

    String getName(){
        return name;
    }


    @Override
    void feed() {
        hunger -= 50;
        bathroom += 20;
        thirst += 30;
        happiness += 15;
    }

    @Override
    void relievePetBladder() {
        bathroom -= 80;
        health += 15;
    }

    @Override
    void petStatus() {
        super.petStatus();
    }

    @Override
    void tick(){
        wasteLevel += 15;
        happiness -= 5;
        health -= 5;
        hunger += 20;
        bored += 10;
    }

    //method of behavior*********
    void walkDog(){
        bathroom -= 75;
        thirst += 10;
        happiness += 5;
    }

    void cleanDogCage(){
        health+= 45;
        happiness += 25;
    }
}
