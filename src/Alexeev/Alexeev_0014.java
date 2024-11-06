package Alexeev;

import java.util.Scanner;

public class Alexeev_0014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int d = 0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                d = i;
                break;
            }
        }
        System.out.println((a * b) / d);
    }
}