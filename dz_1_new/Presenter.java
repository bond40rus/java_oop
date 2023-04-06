package dz_1_new;

import javax.sound.sampled.Port;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }
    
    public void newPerson() {
        String pOrK = view.getText("who new person Parent or Kid ? => ");

        String name = view.getText("write name => ");
        int age = view.getInt("write age => ");
        model.setName(name);
        model.setAge(age);
        String result = model.newPersonParent();

        if (pOrK.equals("Parent")) {
            result = model.newPersonParent();
        }
        else {
            result = model.newPersonKid();
        }
        view.print(result);

    }
    

}


