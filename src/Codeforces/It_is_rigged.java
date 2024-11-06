package Codeforces;

import java.util.Scanner;

public class It_is_rigged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            int e = scanner.nextInt();
            int sum = s;
            while (n-- > 1) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if (a >= s && b >= e) {
                    sum = -1;
                }
            }
            System.out.println(sum);
        }
    }
}
