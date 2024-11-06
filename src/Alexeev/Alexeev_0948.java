package Alexeev;

import java.util.Scanner;

public class Alexeev_0948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int p = 0, t = 1, f = k;
        for (int i = 1; i <= n; i++) {
            if (k < n) {
                p = k;
                k += f;
                t++;
            } else {
                System.out.println(t);
                System.out.println(n - p);
                break;
            }
        }
    }
}