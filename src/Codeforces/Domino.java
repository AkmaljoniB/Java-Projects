package Codeforces;

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s1 = 0, s2 = 0, t = 0;
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (x % 2 != 0 && y % 2 == 0) t++;
            if (y % 2 != 0 && x % 2 == 0) t++;
            s1 += x;
            s2 += y;
        }
        if (s1 % 2 == 0 && s2 % 2 == 0) System.out.println(0);
        else if (t % 2 == 0 && t != 0) System.out.println(1);
        else System.out.println(-1);
    }
}
