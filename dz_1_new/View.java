package dz_1_new;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public String getText(String title) {
        System.out.printf("%s",title);
        return in.nextLine();
    }

    public int getInt(String title) {
        System.out.printf("%s",title);
        return in.nextInt();
    }
    
    public void print(String title) {
        System.out.printf("%s", title);
    }
}
