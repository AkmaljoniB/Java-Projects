package Codeforces;

import java.util.Scanner;

public class T_prostie_chisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n, x, t;
        boolean[] b = new boolean[1000001];
        n = scanner.nextLong();
        b[0] = true;
        b[1] = true;
        for (int i = 2; i < 1000; i++) {
            if (!b[i]) {
                for (int j = i + i; j < 1000001; j += i) {
                    b[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            x = scanner.nextLong();
            t = (long) Math.sqrt(x);
            if (t * t == x && !b[(int) t])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}