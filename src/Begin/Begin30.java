package Begin;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("радиан = " + (a * 180 / pi));
    }
}
