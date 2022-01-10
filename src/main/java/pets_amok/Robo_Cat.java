package pets_amok;

public class Robo_Cat extends Robotic_Pet {

    protected int sleepiness;

    Robo_Cat(String name, String description, int happiness, int health, int bored, int wasteLevel, int oilLevel, int sleepiness) {
        super(name, description, happiness, health, bored, wasteLevel, oilLevel);
        this.sleepiness = sleepiness;
        this.wasteLevel = wasteLevel;
    }

    //getter********
    int getSleepiness(){
        return sleepiness;
    }
    int getWasteLevel(){
        return wasteLevel;
    }

    String getName(){
        return name;
    }

    //methods of behavior
    @Override
    void groom() {
        happiness += 25;
        oilLevel += 5;
        health += 10;
    }

    @Override
    void tick(){
        wasteLevel += 15;
        happiness -= 5;
        health -= 5;
        bored += 10;
    }

    @Override
    void petStatus() {
        super.petStatus();

        //control sleepiness levels
        if(sleepiness < 0){
            sleepiness = 0;
        }else if(sleepiness > 100){
            sleepiness = 100;
        }
    }

    void takeToLitter(){
        oilLevel -= 10;
        happiness += 10;
        health += 10;
    }

    void cleanLitter(){
        happiness += 20;
        health+= 20;
    }
}
