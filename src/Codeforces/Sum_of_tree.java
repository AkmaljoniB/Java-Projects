package Codeforces;

import java.util.Scanner;

public class Sum_of_tree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n < 7 || n == 9) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                if (n % 3 == 0) {
                    System.out.println("1 4 " + (n - 5));
                } else {
                    System.out.println("1 2 " + (n - 3));
                }
            }
        }
    }
}
