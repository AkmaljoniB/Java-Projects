package Codeforces;

import java.util.Scanner;

public class Strange_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[] arr = new int[n];
            long s1 = 0, s2 = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                s1 += arr[i];
                s2 += Math.ceil((double) arr[i] / x);
            }
            long k = s1/x;
            if (s1%x!=0)k++;
            System.out.println(k + " " + s2);
        }
    }
}
