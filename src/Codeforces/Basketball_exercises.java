package Codeforces;

import java.util.Scanner;

public class Basketball_exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr1 = new long[n];
        long[] arr2 = new long[n];
        for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();
        for (int i = 0; i < n; i++) arr2[i] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            arr1[i] = Math.max(arr1[i-1],arr1[i]+arr2[i-1]);
            arr2[i] = Math.max(arr2[i-1],arr2[i]+arr1[i-1]);
        }
        System.out.println(Math.max(arr1[n - 1], arr2[n - 1]));
    }
}
