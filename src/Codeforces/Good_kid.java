package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Good_kid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int s=1;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            arr[0]++;
            for (int i = 0; i < n; i++) {
                s*=arr[i];
            }
            System.out.println(s);
        }
    }
}
