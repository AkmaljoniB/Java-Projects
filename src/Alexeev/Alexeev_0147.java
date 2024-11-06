package Alexeev;

import java.util.Scanner;

public class Alexeev_0147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 1, c, e = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            e = c;
        }
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(e);
        }
    }
}