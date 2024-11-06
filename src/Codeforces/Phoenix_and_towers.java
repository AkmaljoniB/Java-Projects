package Codeforces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Phoenix_and_towers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i;
            }
            Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
            int[] a = new int[n];
            int l = 1;
            for (int i = n - 1; i >= 0; i--) {
                a[arr[i][1]] = l;
                l++;
                if (l > m) l -= m;
            }
            System.out.println("YES");
            for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
            System.out.println();
        }
    }
}
