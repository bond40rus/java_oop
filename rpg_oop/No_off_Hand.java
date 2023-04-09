package rpg_oop;



public class No_off_Hand extends Off_Hand {
    private String name ;

    public No_off_Hand(int counterattack) {
        super(counterattack = 0);
        this.name = " No_off_hand ";
    }

    @Override
    public int absorb() {
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }

    

    

    
}
