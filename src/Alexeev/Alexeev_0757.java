package Alexeev;

import java.util.Scanner;

public class Alexeev_0757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long c = scanner.nextLong();
        long h = scanner.nextLong();
        long o = scanner.nextLong();
        c /= 2;
        h /= 6;
        if (c > h) {
            c = h;
        }
        if (c > o) {
            c = o;
        }
        System.out.println(c);
    }
}