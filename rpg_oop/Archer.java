package rpg_oop;


public class Archer extends Warrior<Throwing, Armor>  {
    
    public Archer(String name, int hp, Throwing weapon, Plate plate, No_off_Hand off_Hand) {
        super(name,hp,weapon, plate, off_Hand);
    }

    public int getRange() {
        return rnd.nextInt(weapon.getDistance()+1);

    }

    @Override
    public String toString() {
        return "Archer [" + super.toString() + "]";
    }


    
}
