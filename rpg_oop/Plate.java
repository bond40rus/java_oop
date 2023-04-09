package rpg_oop;

public class Plate implements Armor {

    @Override
    public int absorb() {
        return 5;
    }

    @Override
    public String toString() {
        return "Plate [" + "absorb = " + absorb() + "]";
    }
    
    




    
}
