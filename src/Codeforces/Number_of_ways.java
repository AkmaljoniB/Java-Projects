package Codeforces;

import java.util.Scanner;

public class Number_of_ways {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n + 1];
        for (int i = 1; i <= n; i++) arr[i] = scanner.nextInt() + arr[i - 1];
        if (arr[n] % 3 != 0) System.out.println("0");
        else {
            long p = 0, sum = 0;
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] == arr[n]/3) sum += p;
                if (arr[i] == 2 * arr[n]/3) p++;
            }
            System.out.println(sum);
        }
    }
}
