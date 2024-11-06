package Grafiks;

import java.util.Scanner;

public class Grafiks_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (y <= 1.5 && y >= -2) {
            System.out.println("Нукта дар чои зур истодааст: " + x + " " + y);
        } else {
            System.out.println("Нукта дар чои безеб истодааст! " + x + " " + y);
        }
    }
}
