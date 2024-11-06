package Grafiks;

import java.util.Scanner;

public class Grafiks_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y <= 1 && y >= -3 && x >= 1 && x <= 3) {
            System.out.println("Э и бачаи хдмайе тири координати зур хобидагияй!!! бахот 5" + x + " " + y);
        } else {
            System.out.println("Бача хато кади тири координати безеб ховай!!! я 2 монм " + x + " " + y);
        }
    }
}
