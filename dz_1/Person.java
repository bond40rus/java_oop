package dz_1;
/**
 * Person
 */
public class Person implements ActionPerson {

    private String fullname;
    private int age;
    //private String status;


    public  Person(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }


    public Integer getAge(){
        return age;
    }

    public String getName(){
        return fullname;
    }

    @Override
    public String toString(){
        return "Person name " + fullname + " age " + age +"";

    }

    @Override
    public void addPerson(String fullname, int age) {
        this.fullname = fullname;
        this.age = age;
    }
}