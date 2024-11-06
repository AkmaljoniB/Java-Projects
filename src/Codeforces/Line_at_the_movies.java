package Codeforces;

import java.util.Scanner;

public class Line_at_the_movies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = 0, w = 0;
        String s = "YES";
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a == 25) q++;
            else if (a == 50) {
                q--;
                w++;
            } else {
                if (w == 0) q -= 3;
                else {
                    q--;
                    w--;
                }
            }
            if (q < 0 || w < 0) s = "NO";
        }
        System.out.println(s);
    }
}
