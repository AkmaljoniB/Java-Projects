package Codeforces;

import java.util.Scanner;

public class Make_them_almost_equal_in_modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            long[] arr = new long[n];
            for (int j = 0; j < n; j++) arr[j] = scanner.nextLong();
            long x = 1;
            out:
            while (true) {
                x = x * 2;
                for (int j = 1; j < n; j++) {
                    if ((arr[j] % 2) != (arr[j - 1] % 2)) {
                        break out;
                    } else arr[j - 1] = arr[j - 1] / 2;

                }
                arr[n - 1] = arr[n - 1] / 2;
            }
            System.out.println(x);
        }
    }
}
