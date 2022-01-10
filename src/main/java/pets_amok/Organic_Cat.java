package pets_amok;

public class Organic_Cat extends Organic_Pet{

    protected int sleepiness;
    Organic_Cat(String name, String description, int happiness, int health, int bathroom, int bored, int wasteLevel,
                int thirst, int hunger, int sleepiness) {
        super(name, description, happiness, health, bathroom, bored, wasteLevel, thirst, hunger);
        this.sleepiness = sleepiness;
    }

    //getter
    public int getWasteLevel(){
        return wasteLevel;
    }

    String getName(){
        return name;
    }

    @Override
    void feed() {
        bathroom += 15;
        thirst += 15;
        sleepiness +=50;
        hunger -= 25;
    }

    @Override
    void relievePetBladder() {
        bathroom -= 35;
        health += 5;
    }

    //getters***********************
    int getSleepiness(){
        return sleepiness;
    }

    //methods of behavior*******************
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

    @Override
    void tick(){
        wasteLevel += 7;
        happiness -= 5;
        health -= 5;
        hunger += 10;
        bored += 15;
    }

    void takeToLitter(){
        bathroom -= 10;
        happiness += 10;
        health += 10;
    }

    void cleanLitter(){
        happiness += 20;
        health+= 20;
    }

    void catNap(){
        sleepiness -= 60;
    }
}
