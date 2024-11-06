package Codeforces;

import java.util.Scanner;

public class Book_reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            int[] arr = new int[10];
            int s = 0, l = 0,k=0;
            for (int i = 0; i < 10; i++) {
                long a = (m * i) % 10;
                arr[i] = (int) a;
                if (i != 0 && arr[i] == 0) l = 1;
                if (l == 0) {
                    s += arr[i];
                    k++;
                }
            }
            long p = (n - (n % m)) % 10;
            long f = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] == p) {
                    f += arr[i];
                    break;
                } else f += arr[i];
            }
            System.out.println(((n / m) / k) * s + f);
        }
    }
}