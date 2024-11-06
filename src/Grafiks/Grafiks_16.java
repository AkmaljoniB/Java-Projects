package Grafiks;

import java.util.Scanner;

public class Grafiks_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y >= -2 && x >= 1 && x <= 2.5 && y >= 1.5) {
            System.out.println("Э и бачаи хдмайе тири координати зур хобидагияй!!! бахот 5" + x + " " + y);
        } else {
            System.out.println("Бача хато кади тири координати безеб ховай!!! я 2 монм " + x + " " + y);
        }
    }
}
