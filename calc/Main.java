package calc;
import java.util.Scanner;

import org.w3c.dom.Text;

import SaveFile.Applications.Notepad;
import SaveFile.Format.Txt;
import java.util.Date;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
   
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Date d = new Date();

        System.out.println("Введите вещественную часть первого числа x: ");
        double x = sc.nextDouble();
        System.out.println("Введите вещественную часть второго числа y: ");
        double y = sc.nextDouble();

        System.out.println("Введите мнимую часть первого числа w: ");
        double w = sc.nextDouble();
        System.out.println("Введите мнимую часть первого числа z: ");
        double z = sc.nextDouble();

        CalculateComplex calcSum = new CalculateComplex(x, y);
        calcSum.setW(w);
        calcSum.setZ(z);
        
        System.out.println("Выберите действие:  ");
        System.out.println("1 - Сумма;");
        System.out.println("2 - Разница;");
        System.out.println("3 - Умножение;");
        System.out.println("4 - Деление;");
        int check = sc.nextInt();

        String text = "";

        switch (check) {
            case 1: {
                text = d + " sum = " + calcSum.sum() + "\n";             
                break;
            }
            case 2: {
                text = d + " sum = " + calcSum.diff() + "\n";              
                break;
            }
            case 3: {
                text = d + " sum = " + calcSum.mult() + "\n";               
                break;
            }
            case 4: {
                text = d + " sum = " + calcSum.div() + "\n";               
                break;
            }
            default: {
                System.out.println("Ошибка.");
            }
        }
    Files.write(Paths.get("log_calc.txt"), text.getBytes(), StandardOpenOption.APPEND);

    System.out.println("Запись в логе " + text);
    } 

}

