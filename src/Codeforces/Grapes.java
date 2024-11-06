package Codeforces;

import java.util.Scanner;

public class Grapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (x > a || y > a - x + b || z > a + b + c - x - y) System.out.println("NO");
        else System.out.println("YES");
    }
}
