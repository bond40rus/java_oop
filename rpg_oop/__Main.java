package rpg_oop;

public class __Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Rouge> rouge = new Team<>();

        archers.addPersons(new Archer("Robin", 100, new Bow(20),new Plate(),new No_off_Hand(0)))
                .addPersons(new Archer("Sergey", 100, new Bow(15),new Plate(),new No_off_Hand(0)));

        rouge.addPersons(new Rouge("Robin", 150, new Knife(),new Plate(),new Shield(5)))
                .addPersons(new Rouge("Sergey", 150, new Knife(),new Plate(),new Shield(5)));
        

        Archer arch1 =  new Archer("Robin", 100, new Bow(20),new Plate(),new No_off_Hand(0));
        Archer arch2 =  new Archer("Gobla", 100, new Bow(15),new Plate(),new No_off_Hand(0));
        Battle fight  = new Battle(arch1, arch2);
        fight.run();

        
    }
    
}
