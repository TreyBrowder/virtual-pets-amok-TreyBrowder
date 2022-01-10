package pets_amok;

public abstract class Organic_Pet extends Virtual_Pet {

    protected int thirst;
    protected int hunger;
    protected int bathroom;

    //constructor******************
    Organic_Pet(String name, String description, int happiness, int health, int bathroom, int bored, int wasteLevel, int thirst, int hunger) {
        super(name, description, happiness, health, bored, wasteLevel);
        this.thirst = thirst;
        this.hunger = hunger;
        this.bathroom = bathroom;
    }

    //dogs eat more than cats so increase instances higher in dogs than cats
    abstract void feed();
    abstract void relievePetBladder();
    abstract void tick();

    //getters***********
    int getThirst(){
        return thirst;
    }

    int getHunger(){
        return hunger;
    }

    int getBathroom(){
        return bathroom;
    }

    //method of behavior***************

   @Override
   void petStatus(){
       //control happiness level
       if(happiness < 0){
            happiness = 0;
       }else if(happiness > 100){
           happiness = 100;
       }

       if(health < 0){
           health = 0;
       }else if(health > 100){
           health = 100;
       }

       if(bathroom < 0){
           bathroom = 0;
       }else if(bathroom > 100){
           bathroom = 100;
       }

       if(bored < 0){
           bored = 0;
       }else if(bored > 100){
           bored = 100;
       }

       if(thirst < 0){
           thirst = 0;
       }else if(thirst > 100){
           thirst = 100;
       }

       if(hunger < 0){
           hunger = 0;
       }else if(hunger > 100){
           hunger = 100;
       }
   }


    void giveWater(){
        thirst -= 50;
        health += 5;
    }

    void giveFood(){
        hunger -= 50;
        health += 5;
    }


}
