package Codeforces;

import java.util.Scanner;

public class Make_it_equal_again {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for (int i = 0; i < ar.length; i++) ar[i] = sc.nextInt();
            int s = 0, e = 0;
            for (int k : ar) {
                if (k == ar[0]) s++;
                else break;
            }
            for (int i = ar.length - 1; i >= 0; i--) {
                if (ar[i] == ar[ar.length - 1]) e++;
                else break;
            }
            if (s == n || e == n) System.out.println(0);
            else if (ar[0] != ar[ar.length - 1]) System.out.println(n - Math.max(s, e));
            else System.out.println(n - (s + e));
        }
    }
}
