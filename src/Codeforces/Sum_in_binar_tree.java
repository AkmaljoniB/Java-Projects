package Codeforces;

import java.util.Scanner;

public class Sum_in_binar_tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long s = 0;
            while (n > 0) {
                s += n;
                n /= 2;
            }
            System.out.println(s);
        }
    }
}