package rpg_oop;
public class Rouge extends Warrior<Knife, Armor > {

    public Rouge(String name, int hp, Knife weapon, Plate plate, Shield shield ) {
        super(name, hp, weapon, plate, shield);
    }

    @Override
    public String toString() {
        return "Rouge [" + super.toString() + "]";
    }
    

}
