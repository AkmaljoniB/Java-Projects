package Codeforces;

import java.util.Scanner;

public class XXXXX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int sum = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                sum += arr[i];
            }
            if (sum % x != 0) System.out.println(n);
            else {
                int p = -1;
                for (int i = 0; i < n; i++) {
                    if ((sum - arr[i]) % x != 0) {
                        p = n - i - 1;
                        break;
                    }
                    sum -= arr[i];
                }
                for (int i = n - 1; i >= 0; i--) {
                    if ((sum - arr[i]) % x != 0) {
                        p = Math.max(p, i);
                        break;
                    }
                    sum -= arr[i];
                }
                System.out.println(p);
            }
        }
    }
}
