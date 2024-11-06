package Alexeev;

import java.util.Scanner;

public class Alexeev_0817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long d = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(((n+m)*d*k)-(d*d*n*m));
    }
}
