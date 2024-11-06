package Codeforces;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long p = a;
        p = (long) Math.sqrt(p * b * c);
        System.out.println((p / a + p / b + p / c) * 4);
    }
}
