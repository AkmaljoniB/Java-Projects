package Codeforces;

import java.util.Scanner;

public class Operations_are_different {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (c == d && c == 0) System.out.println(0);
            else if (Math.abs(c - d) %2!=0) System.out.println(-1);
            else if (c == d) System.out.println(1);
            else System.out.println(2);
        }
    }
}
