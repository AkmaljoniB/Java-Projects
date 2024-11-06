package Codeforces;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int k = scanner.nextInt();
        int m =1000000007;
        int[] arr = new int[100001];
        int[] sum = new int[100001];
        for (int i = 0; i < 100001; i++) {
            if (i < k) {
                arr[i] = 1;
                sum[i] = i + 1;
            } else {
                arr[i] = (arr[i - 1] + arr[i - k]) % m;
                sum[i] = (sum[i - 1] + arr[i]) % m;
            }
        }
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println((sum[b] - sum[a - 1]+m)%m);
        }
    }
}

//k= 1;  2 4 8 16 32 64 128 256
//k= 2;  1 2 3 5  8  13 21  34
//k= 3;  1 1 2 3  4  6  9   13
//k= 4;  1 1 1 2  3  4  5   7