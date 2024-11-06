package Codeforces;

import java.util.Scanner;

public class Drive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[]arr = new int[n+1];
            int min = 0;
            for (int i = 1; i <= n; i++) {
                arr[i]=scanner.nextInt();
                min = Math.max(min,arr[i]-arr[i-1]);
            }
            System.out.println(Math.max((x-arr[n]) *2,min));
        }
    }
}
