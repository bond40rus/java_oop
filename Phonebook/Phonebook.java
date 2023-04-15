package Phonebook;
import java.util.ArrayList;
import java.util.List;


public class Phonebook {
    private List<Contact> contacts;
    
    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getCotact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }


    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }


    public int count() {
        return contacts.size();
    }
}
