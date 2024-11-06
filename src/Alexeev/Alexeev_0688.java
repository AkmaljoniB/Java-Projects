package Alexeev;

import java.util.Scanner;

public class Alexeev_0688 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            int p = scanner.nextInt();
            int f = scanner.nextInt();
            double a = Math.sqrt(Math.pow(p - x1, 2) + Math.pow(f - y1, 2));
            double b = Math.sqrt(Math.pow(p - x2, 2) + Math.pow(f - y2, 2));
            if (a <= b / 2 && k == 0) k = i + 1;
        }
        System.out.println(k == 0 ? "NO" : k);
    }
}
