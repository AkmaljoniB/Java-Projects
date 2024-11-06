package Codeforces;

import java.util.Scanner;

public class Is_it_possible_to_build_a_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextInt(), s = 0;
            for (int i = 0; i < n; i++) s += scanner.nextInt();
            System.out.println(Math.sqrt(s) == (int) Math.sqrt(s) ? "YES" : "NO");
        }
    }
}
