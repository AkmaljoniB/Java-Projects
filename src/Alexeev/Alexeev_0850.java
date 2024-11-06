package Alexeev;

import java.util.Scanner;

public class Alexeev_0850 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        int max = Math.toIntExact(Math.max(a, b));
        int min = Math.toIntExact(Math.min(a, b));
        System.out.println((max+1) / 2);
        System.out.println(min);
    }
}