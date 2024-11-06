package Codeforces;

import java.util.Scanner;

public class Array_coloring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s =0;
            for (int i = 0; i < n; i++) {
                s+=scanner.nextInt();
            }
            System.out.println(s%2==0?"YES":"NO");
        }
    }
}
