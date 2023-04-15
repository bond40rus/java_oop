package Phonebook;
import java.time.LocalDate;

public class Contact {
    public LocalDate date;
    public String firstName;
    public String lastName;
    public String company;
    public String phone;

    public String description;

    public Contact(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
    

    @Override
    public boolean equals(Object obj) {
        Contact t = (Contact)obj;
        return this.firstName == t.firstName
                && this.lastName == t.lastName
        ;
    }
    
}
