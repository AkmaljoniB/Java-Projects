package Begin;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y, b;
        System.out.println("Чанд кг қанд даркор аст: ");
        double x = scanner.nextDouble();
        System.out.println("Нархи қанд:  = ");
        double a = scanner.nextDouble();
        b = a / x;
        System.out.println("Нархи 1 кг қанд:"+b);
        System.out.println("Чӣ қадар қанд: ");
        y = scanner.nextDouble();
        System.out.println(b * y);
    }
}
