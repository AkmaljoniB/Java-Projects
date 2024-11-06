package Alexeev;

import java.util.Scanner;

public class Alexeev_0003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if (n % 10 == 5) {
            System.out.println(n * n);
        }
    }
}