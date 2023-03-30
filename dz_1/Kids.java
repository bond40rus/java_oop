package dz_1;

public class Kids extends Parents {
    private Status status;
    private Person person;

    public Kids(Person person, Status status) {
        super(person,status);

        }

        // @Override
        // public String toString(){
        //     return "Person name [" + person.getName() + "] status [" + status +"]";
    
        // }

        public Status getStatus(){
            return status;
        }
    
} 
