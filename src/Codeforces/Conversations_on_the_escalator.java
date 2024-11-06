package Codeforces;

import java.util.Scanner;

public class Conversations_on_the_escalator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int H = scanner.nextInt();
            int p =0;
            for (int i = 0; i < n; i++) {
                int a =scanner.nextInt();
                if (H!=a&&Math.abs(H-a)%k==0 && Math.abs(H-a)/k<m)p++;
            }
            System.out.println(p);
        }
    }
}
