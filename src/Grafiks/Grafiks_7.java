package Grafiks;

import java.util.Scanner;

public class Grafiks_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x >= 1 && x <= 3 && y <= -1 && y >= -2) {
            System.out.println("Нукта дар чои зур истодааст: " + x + " " + y);
        } else {
            System.out.println("Нукта дар чои безеб истодааст! " + x + " " + y);
        }
    }
}