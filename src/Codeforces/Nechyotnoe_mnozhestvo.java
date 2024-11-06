package Codeforces;

import java.util.Scanner;

public class Nechyotnoe_mnozhestvo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            int n = scanner.nextInt();
            int k = 0;
            for (int i = 0; i < n * 2; i++) {
                int a = scanner.nextInt();
                if (a % 2 != 0) {
                    k++;
                }
            }
            if ((k % n) == 0 && k != 0 && (k/n)%2!=0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}