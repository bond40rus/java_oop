package dz_1;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Program  {  

    
    public static void main(String[] args) {
        ActionPersonIml pers11 = new ActionPersonIml();


        
        Person pers1 = new Person("Ivan", 23); 
        

        Parents parent = new Parents(pers1, Status.parent); 
        Person pers2 = new Person("Vasya", 5);
        Kids kid = new Kids(pers2, Status.kid);


        if (Status.parent == parent.getStatus()){
            System.out.printf("%s Является родителем %s", parent, kid);
        }

        System.out.println();
        ArrayList<Person> list = new ArrayList<>();
        list.add(pers11.addPerson("Ivan", 23));
        list.add(new Person("Pavel", 30));
        list.add(new Person("Rita", 25));
    

        System.out.println(Arrays.toString(list.toArray()));




        //System.out.println(pers1.getName());
    }
}
