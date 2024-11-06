package Alexeev;

import java.util.Scanner;

public class Alexeev_0929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = a / 6;
        long c = a % 6;
        if (c == 5) {
            b = b + 2;
        } else if (c == 4) {
            b = b + 3;
        } else if (c == 3) {
            b = b + 4;
        } else if (c == 2) {
            b = b + 5;
        } else if (c == 1) {
            b = b + 6;
        }
        System.out.println(b);
        System.out.println(a * 6);
    }
}