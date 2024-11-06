package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Together_we_are_force {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            Arrays.sort(arr);
            int k = 1;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == arr[i + 1]) k++;
                else break;
            }
            if (k==n){
                System.out.println(-1);
                continue;
            }
            System.out.println(k + " " + (n - k));
            for (int i = 0; i < k; i++) System.out.print(arr[i] + " ");
            System.out.println();
            for (int i = k; i < n; i++) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}
