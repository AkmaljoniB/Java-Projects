package Codeforces;

import java.util.Scanner;

public class Vibori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int max = Math.max(a, Math.max(b, c));
            if (a != max || (a != b && a != c)) {
                if (a == max) {
                    System.out.print(0+" ");
                } else {
                    System.out.print((max - a + 1)+" ");
                }
            } else {
                System.out.print(1+" ");
            }
            if (b != max || (b != a && b != c)) {
                if (b == max) {
                    System.out.print(0+" ");
                } else {
                    System.out.print((max - b + 1)+" ");
                }
            } else {
                System.out.println(1+" ");
            }
            if (c != max || (c != a && c != b)) {
                if (c == max) {
                    System.out.println(0);
                } else {
                    System.out.println(max - c + 1);
                }
            } else {
                System.out.println(1);
            }
        }
    }
}