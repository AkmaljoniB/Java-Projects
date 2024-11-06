package Codeforces;

import java.util.Scanner;

public class Oath_of_the_Night_is_Watch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0, min = Integer.MAX_VALUE;
        int p = 1, l = 1;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (max < a) {
                max = a;
                p = 1;
            } else if (max == a) p++;
            if (min > a) {
                min = a;
                l = 1;
            } else if (min == a) l++;
        }
        System.out.println(Math.max(n - l - p, 0));
    }
}