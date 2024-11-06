package Codeforces;

import java.util.Scanner;

public class Zadacha_Bakhgolda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n / 2);
        for (int i = 1; i <= n / 2; i++) {
            if (n % 2 != 0 && i==n/2) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
    }
}