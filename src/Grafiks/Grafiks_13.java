package Grafiks;

import java.util.Scanner;

public class Grafiks_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x >= 1 && x <= 4 && y >= 2 && y <= 4) {
            System.out.println("Э и бачаи хдмайе тири координати зур хобидагияй!!! " + x + " " + y);
        } else {
            System.out.println("Бача хато кади тири координати безеб ховай!!! " + x + " " + y);
        }
    }
}