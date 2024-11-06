package Alexeev;

import java.util.Scanner;

public class Alexeev_0010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        for (int i = -100; i <= 100; i++) {
            if ((a * Math.pow(i, 3)) + (b * Math.pow(i, 2)) + c * i + d == 0) {
                System.out.println(i);
            }
        }
    }
}