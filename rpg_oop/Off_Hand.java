package rpg_oop;

public abstract class Off_Hand implements Armor {
    private int counterattack;
    
    public Off_Hand (int counterattack){
        this.counterattack = counterattack ; 
    }


    public int getСounterattack() {
        return counterattack;
    }


    @Override
    public String toString() {
        return "Shield [shield_strike= " + counterattack + " and absorb = "+ absorb() + "]";
    }



    

    
    
}
