package Begin;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, a, y,b ;
        System.out.println("Чанд кг қанд даркор аст: ");
        x = scanner.nextDouble();
        System.out.println("Нархи қанд:  = ");
        a = scanner.nextDouble();
        System.out.println("Чанд кг шакар даркор аст: ");
        y = scanner.nextDouble();
        System.out.println("Нархи шакар:  = ");
        b = scanner.nextDouble();
        System.out.println("Нархи 1 қанд ="+a/x);
        System.out.println("Нархи 1 шакар ="+b/y);
        System.out.println("Қанд аз шакар ="+((a/x)/(b/y)));
    }
}
