package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Make_it_equal_in_modulus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = 0;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] == 1) k = 1;
            }
            Arrays.sort(arr);
            if (k == 1 && arr[0] != arr[n - 1]) {
                k = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i] - arr[i - 1] == 1) {
                        k = 1;
                        break;
                    }
                }
                if (k == 0) System.out.println("YES");
                else System.out.println("NO");
            } else System.out.println("YES");
        }
    }
}
