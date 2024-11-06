package Alexeev;

import java.util.Scanner;

public class Alexeev_0844 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = (long)Math.sqrt(a*b);
        System.out.println(a*b==c*c?c:0);
    }
}