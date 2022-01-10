package pets_amok;

public abstract class Robotic_Pet extends Virtual_Pet{

   protected int oilLevel;

   //constructor
    Robotic_Pet(String name, String description, int happiness, int health, int bored, int wasteLevel, int oilLevel) {
        super(name, description, happiness, health, bored, wasteLevel);
        this.oilLevel = oilLevel;
    }

    //robo dog needs special types of oil to keep joints healthy
    //remember dogs hate baths/grooming and cats love it - this will affect happiness
    //for both in different ways...(definitely reaching with this one lol)
    abstract void groom();
    abstract void tick();

    @Override
    void petStatus(){
        //control happiness level
        if(happiness < 0){
            happiness = 0;
        }else if(happiness > 100){
            happiness = 100;
        }

        //control health level
        if(health < 0){
            health = 0;
        }else if(health > 100){
            health = 100;
        }

        //control bored level
        if(bored < 0){
            bored = 0;
        }else if(bored > 100){
            bored = 100;
        }

        //control oil level
        if(oilLevel < 0){
            oilLevel = 0;
        }else if(oilLevel > 100){
            oilLevel = 100;
        }
    }

    //getter
    int getOilLevel(){
        return oilLevel;
    }

    //method of behavior
    void giveOil(){
        oilLevel += 50;
    }
}
