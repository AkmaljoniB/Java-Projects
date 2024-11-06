package Codeforces;

import java.util.Scanner;

public class Pashmak_and_garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int a = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (Math.abs(x2-x1) == Math.abs(y2-y1)) {
            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else if (y1 == y2) {
            System.out.println(x1 + " " + (y1 - a) + " " + x2 + " " + (y2 - a));
        } else if (x1 == x2) {
            System.out.println((a + x1) + " " + y1 + " " + (a + x2) + " " + y2);
        } else {
            System.out.println(-1);
        }
    }
}