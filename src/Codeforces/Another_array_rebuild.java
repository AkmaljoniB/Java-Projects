package Codeforces;

import java.util.Scanner;

public class Another_array_rebuild {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = 1, l = 0, p = y;
            while ((y - x) / k >= n || (y - x) % k != 0) k++;
            for (int i = 0; i < n; i++) {
                System.out.print((p - l) + " ");
                l += k;
                if (p-l<=0) {
                    l=-k;
                    k=-k;
                }
            }
            System.out.println();
        }
    }
}
