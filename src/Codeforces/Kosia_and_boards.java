package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Kosia_and_boards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            for (int i = 0; i < m; i++) {
                a[0]=sc.nextInt();
                Arrays.sort(a);
            }
            long s=0;
            for (int i = 0; i < n; i++) s+=a[i];
            System.out.println(s);
        }
    }
}