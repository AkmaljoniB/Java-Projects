package Codeforces;

import java.util.Scanner;

public class Do_it_well {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            Integer[] arr = new Integer[n];
            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
            int p = 0, l = 0;
            for (int i = n - 1; i > 0; i--) {
                if (l == 1 && arr[i] >= arr[i - 1]) p = i - 1;
                else if (arr[i] > arr[i - 1]) {
                    p = i - 1;
                    l++;
                } else if (p != 0) break;
            }
            System.out.println(p);
        }
    }
}
