package Alexeev;

import java.util.Scanner;

public class Alexeev_0819 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        System.out.println(2 * (a*b+a*c+b*c));
        System.out.println(a*b*c);
    }
}
