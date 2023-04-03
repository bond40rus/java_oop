package dz_1;

public interface Printer {
    default void print(String text) {
        System.out.println(text);
    }
    
}
