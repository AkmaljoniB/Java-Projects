package Alexeev;

import java.util.Scanner;

public class Alexeev_0798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        long i = scanner.nextLong();
        long j = scanner.nextLong();
        long c = scanner.nextLong();
        if (m * n % 2 == 0) {
            System.out.println("equal");
        } else {
            if (c == 0) {
                if ((i + j) % 2 == 0) {
                    System.out.println("black");
                } else {
                    System.out.println("white");
                }
            } else {
                if ((i + j) % 2 != 0) {
                    System.out.println("black");
                } else {
                    System.out.println("white");
                }
            }
        }
    }
}