package Alexeev;

import java.util.Scanner;

public class Alexeev_0694 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String s = "YES";
        for (int i = 1; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (x > b || a > y) s = "NO";
            x = Math.max(x, a);
            y = Math.min(y, b);
        }
        System.out.println(s);
    }
}
