package Codeforces;

import java.util.Scanner;

public class Minimize_thickness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int s = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                s += arr[i];
            }
            int l = 0, k = 0,max = 0, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                l += arr[i];
                k++;
                if (s % l == 0) {
                    max = k;
                    int p = 0,c=0;
                    for (int j = i + 1; j < n; j++) {
                        p += arr[j];
                        c++;
                        if (p == l) {
                            max = Math.max(max, c);
                            c = 0;
                            p = 0;
                        }
                    }
                    if (p == 0) min = Math.min(max, min);
                }
            }
            System.out.println(min);
        }
    }
}
