package dz_1;

public class ActionPersonIml implements ActionPerson {

    @Override
    public Person addPerson(String fullname, int age) {
     return   new Person(fullname, age);
        
 
    }


    
}
