package Codeforces;

import java.util.Scanner;

public class Robot_program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int min = Math.min(x, y);
            int max = Math.max(x, y);
            if (min == max) System.out.println(max + min);
            else System.out.println(min + max + max - min - 1);
        }
    }
}
