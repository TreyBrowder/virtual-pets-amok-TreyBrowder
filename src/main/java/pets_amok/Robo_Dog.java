package pets_amok;

public class Robo_Dog extends Robotic_Pet{

    protected int jointHealth;

    Robo_Dog(String name, String description, int happiness, int health, int bored, int wasteLevel, int oilLevel, int jointHealth) {
        super(name, description, happiness, health, bored, wasteLevel, oilLevel);
        this.jointHealth = jointHealth;
        this.wasteLevel = wasteLevel;
    }

    //getter*******************
    int getJointHealth(){
        return jointHealth;
    }

    int getWasteLevel(){
        return wasteLevel;
    }

    String getName(){
        return name;
    }

    //methods of behavior**********
    @Override
    void groom() {
        health += 20;
        happiness -= 10;
        oilLevel += 10;
        jointHealth += 50;
    }

    @Override
    void tick(){
        wasteLevel += 17;
        happiness -= 10;
        health -= 10;
        bored += 15;
    }

    @Override
    void petStatus() {
        super.petStatus();

        //control sleepiness levels
        if(jointHealth < 0){
            jointHealth = 0;
        }else if(jointHealth > 100){
            jointHealth = 100;
        }
    }

    void walkDog(){
        happiness += 20;
        health += 20;
        oilLevel -= 10;
    }

    void cleanDogCage(){
        health+= 15;
        happiness += 15;
    }
}
