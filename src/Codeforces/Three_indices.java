package Codeforces;

import java.util.Scanner;

public class Three_indices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            arr[1] = scanner.nextInt();
            arr[2] = scanner.nextInt();
            String b = "NO";
            for (int i = 3; i <= n; i++) {
                arr[i] = scanner.nextInt();
                if (b.equals("NO") && arr[i - 1] > arr[i] && arr[i - 1] > arr[i - 2]) {
                    b = "YES\n";
                    b = b.concat((i - 2) + " " + (i-1) + " " + i);
                }
            }
            System.out.println(b);
        }
    }
}
