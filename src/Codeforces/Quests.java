package Codeforces;

import java.util.Scanner;

public class Quests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) b[i] = scanner.nextInt();
            int s = 0, max = 0;
            for (int i = 0; i < n && k > 0; i++) {
                if (a[i] >= max) {
                    s += a[i];
                    max = Math.max(max, b[i]);
                    k--;
                } else {
                    int sum = a[i], m = Math.max(b[i],max), maxi = 0, p = 1;
                    for (int j = 1; j < k && j < n; j++) {
                        maxi = Math.max(maxi, sum + m * (k - p));
                        if (i + p < n) {
                            sum += a[i + p];
                            m = Math.max(m, b[i + p]);
                            maxi = Math.max(maxi, sum);
                            p++;
                        }
                    }
                    if (max * k < maxi) {
                        s += maxi;
                        k = 0;
                    }
                    break;
                }
            }
            System.out.println(s + max * k);
        }
    }
}
//6 6
//10 4 9 4 5 6
//6 3 4 2 5 10