package Alexeev;

import java.util.Scanner;

public class Alexeev_0952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n == 0 && m == 0) System.out.println("0 0");
        else if (n == 0) System.out.println("Impossible");
        else if (m == 0) System.out.println(n + " " + n);
        else {
            if (m <= n) {
                System.out.println(n);
                System.out.println(n + m - 1);
            } else {
                System.out.println(m);
                System.out.println(n + m - 1);
            }
        }
    }
}