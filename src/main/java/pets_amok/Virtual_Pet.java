package pets_amok;

public abstract class Virtual_Pet {
    protected String name;
    protected String description;
    protected int happiness;
    protected int health;
    protected int bored;
    protected int wasteLevel;

    //constructor
    Virtual_Pet(String name, String description, int happiness, int health, int bored, int wasteLevel){
        this.name = name;
        this.description = description;
        this.happiness = happiness;
        this.health = health;
        this.bored = bored;
        this.wasteLevel = wasteLevel;
    }

    //getters********************
    String getName(){
        return name;
    }

    String getDescription(){
        return description;
    }

    int getHealth() {
        return health;
    }

    int getWasteLevel(){
        return wasteLevel;
    }

    int getHappiness() {
        return happiness;
    }

    int getBored(){
        return bored;
    }

    //control status of pets this will differ depending on type of pets
    abstract void petStatus();

    //methods of behaviors
    void playTime(){
        bored -= 50;
    }

}
