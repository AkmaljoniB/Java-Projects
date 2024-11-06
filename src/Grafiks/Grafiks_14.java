package Grafiks;

import java.util.Scanner;

public class Grafiks_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x >= 2 && y >= 1) {
            System.out.println("Э и бачаи хдмайе тири координати зур хобидагияй!!! бахот 5 " + x + " " + y);
        } else if (x <= -1 && y >= 1) {
            System.out.println("Э и бачаи хдмайе тири координати зур хобидагияй!!! бахот 5" + x + " " + y);
        } else {
            System.out.println("Бача хато кади тири координати безеб ховай!!! я 2 монм " + x + " " + y);
        }
    }
}