package Codeforces;

import java.util.Scanner;

public class Hipster_Vasya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println(min);
        System.out.println((max - min) / 2);
    }
}
