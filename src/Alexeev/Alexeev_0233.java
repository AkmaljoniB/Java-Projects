package Alexeev;

import java.util.Scanner;

public class Alexeev_0233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a, k = 0, t = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            k++;
            if (a <= 437 && n == 1) {
                System.out.println("Crash " + k);
            }
            if (a <= 437 && n > 1) {
                System.out.println("Crash " + k);
                break;
            } else if (a > 438) {
                t++;
            }
            if (t == n) {
                System.out.println("No crash");
            }
        }
    }
}