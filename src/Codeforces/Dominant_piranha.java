package Codeforces;

import java.util.Scanner;

public class Dominant_piranha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int min = Integer.MAX_VALUE, max = 0, l = 1,b=0;
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (max < a) {
                    max = a;
                    l = i;
                } else if (max==b && b!=a)l=i-1;
                min = Math.min(min, a);
                b = a;
            }
            if (min == max) System.out.println(-1);
            else System.out.println(l+1);
        }
    }
}
