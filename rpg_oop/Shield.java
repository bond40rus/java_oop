package rpg_oop;


public class Shield extends Off_Hand {
    private String name;

    public Shield(int counterattack) {
        super(counterattack);
        this.name = "Shield";
    }

    @Override
    public int absorb() {
        return 5;

    }

    @Override
    public String toString() {
        return "Shield [name=" + name + super.toString() + "]";
    }

    

    

}
