package Codeforces;

import java.util.Scanner;

public class Everything_everywhere_except_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = 0;
            int[] arr = new int[n];
            String b="NO";
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                s += arr[i];
            }
            for (int i = 0; i < n; i++) {
                if ((double)s / n == arr[i]) {
                    b = "YES";
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
