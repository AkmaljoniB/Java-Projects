package Codeforces;

import java.util.Scanner;

public class S2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long s = 1;
            for (int i = 0; i < n; i++) s *= scanner.nextInt();
            if (s > 2023) System.out.println("NO");
            else {
                if (2023 % s == 0) {
                    System.out.println("YES");
                    for (int i = 1; i < k; i++) System.out.print("1 ");
                    System.out.println(2023/s);
                } else System.out.println("NO");
            }
        }
    }
}
