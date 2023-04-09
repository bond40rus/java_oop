package rpg_oop;

import java.util.Random;

public class Warrior<W extends Weapon, A extends Armor> extends Person { // обобщение <Т> не любой Тип а только  типа класса Weapon
    protected W weapon;
    protected A armor;
    protected static Random rnd = new Random(); 
    

    public Warrior(String name, int hp, W weapon, A armor, A ofHeand){
        super(name, hp); // берем переменные из класса person
        this.weapon = weapon;
        this.armor = armor;
    }

    public int harm() {
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if(isHit) { 
            damage = rnd.nextInt(weapon.damage()+1) - armor.absorb();
            if (damage <0) {
                damage = 0;
            }
        }
        return damage;
    }


    @Override
    public String toString() {
        return "Warrior [ " + this.getName() + 
                " hp = " + getHp() +
                " weapon= " + weapon + "]" 
                ;
    }

    

}
 

