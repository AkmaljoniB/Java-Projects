package Alexeev;

import java.util.Scanner;

public class Alexeev_0035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int n, m, d= 0;
        for (int i = 0; i < s; i++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            d = 19 * m + (n + 239) * (n + 366) / 2;
            System.out.println(d);
        }
    }
}
