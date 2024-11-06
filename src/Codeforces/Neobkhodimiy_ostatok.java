package Codeforces;

import java.util.Scanner;

public class Neobkhodimiy_ostatok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();
            for (long j = n / x; j >= 0; j--) {
                if (j * x + y <= n) {
                    System.out.println(j * x + y);
                    break;
                }
            }
        }
    }
}