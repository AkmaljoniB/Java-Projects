package Codeforces;

import java.util.Scanner;

public class Nit_destroys_the_universe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int k = 1, p = 0, o = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] != 0) {
                    if (o != 0)k=2;
                    p++;
                } else if (p != 0) o++;
            }
            if (k==1 && p==0)k=0;
            System.out.println(k);
        }
    }
}