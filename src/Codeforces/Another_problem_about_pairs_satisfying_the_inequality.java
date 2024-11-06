package Codeforces;

import java.util.*;

public class Another_problem_about_pairs_satisfying_the_inequality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                int a = scanner.nextInt();
                if (a < i) {
                    System.out.println(a+" "+i);
                }
            }
            System.out.println();
        }
    }
}
