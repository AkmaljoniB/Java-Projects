package Codeforces;

import java.util.Scanner;

public class Osveshanie_parka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if (n * m % 2 != 0) {
                System.out.println(((n * m) + 1) / 2);
            } else {
                System.out.println((n * m) / 2);
            }
        }
    }
}
