package rpg_oop;

public class Bow extends Throwing{
    private String name; // что бы никто переменую не менял

    public Bow(int distance) { // public  что бы можно было воспользоватся этим конструктором
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Bow [name=" + name + 
                super.toString() + 
                "]"
        ;
    }

    


    
    



}
    

