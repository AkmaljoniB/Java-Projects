package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Sasha_and_coloring_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s =0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < n/2; i++) {
                s+=arr[n-1-i]-arr[i];
            }
            System.out.println(s);
        }
    }
}
