package dz_1_new;

public class ActionPerson extends PersonModel {

    @Override
    public String newPersonParent() {
        return "name - " + name + " | age - " + age + " status - "+ Status.parent;
    }

    @Override
    public String newPersonKid() {
        return "name - " + name + " | age - " + age + " status - "+ Status.kid;
    }

    @Override
    public void setName(String value) {
        super.name = value;
    }

    @Override
    public void setAge(int value) {
        super.age = value;
    }


    
    
}
