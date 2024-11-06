package Codeforces;

import java.util.Scanner;

public class Polycarp_restore_the_rearrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int l = n - 1;
            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                    l = i;
                    break;
                }
            }
            if (arr[0]==n || arr[n-1]==n){
                for (int i = l; i >= 0; i--) System.out.print(arr[i] + " ");
                for (int i = n - 1; i > l; i--) System.out.print(arr[i] + " ");
                System.out.println();
            } else System.out.println(-1);
        }
    }
}