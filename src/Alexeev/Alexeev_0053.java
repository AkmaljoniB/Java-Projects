package Alexeev;

import java.util.Scanner;

public class Alexeev_0053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = 0, g = 0, b = 0, black = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int a = i * j;
                if (a % 5 == 0) b++;
                else if (a % 3 == 0) g++;
                else if (a % 2 == 0) r++;
                else black++;
            }
        }
        System.out.println("RED : " + r);
        System.out.println("GREEN :  " + g);
        System.out.println("BLUE : " + b);
        System.out.println("BLACK :  " + black);
    }
}
