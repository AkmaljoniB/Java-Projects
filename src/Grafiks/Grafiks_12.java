package Grafiks;

import java.util.Scanner;

public class Grafiks_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y <= 1.5 && y >= -0.5 && x <= 1.5 && x >= -1) {
            System.out.println("Нуқта дар ҷойи зури бад хобидагияй!!! " + x + " " + y);
        } else {
            System.out.println("Нуқта дар ҷойи безеби бад ховай!!! " + x + " " + y);
        }
    }
}