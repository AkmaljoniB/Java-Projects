package Alexeev;

import java.util.Scanner;

public class Alexeev_0286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a < b) {
            System.out.println("<");
        }
        if (a > b) {
            System.out.println(">");
        }
        if (a == b) {
            System.out.println("=");
        }
    }
}