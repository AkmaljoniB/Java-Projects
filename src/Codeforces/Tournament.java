package Codeforces;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar1 = new int[n + 1];
        int[] ar2 = new int[n + 1];
        for (int i = 1; i < n * (n - 1) / 2; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            ar1[x]++;
            ar2[y]++;
        }
        int k = 0, l = 0, p = 0;
        for (int i = n; i > 0; i--) {
            if (ar1[i] + ar2[i] != n - 1) {
                k++;
                if (k == 1) l = i;
                else {
                    p = i;
                    break;
                }
            }
        }
        if (ar1[l] > ar1[p]) System.out.println(l + " " + p);
        else System.out.println(p + " " + l);
    }
}
