package Codeforces;

import java.util.Scanner;

public class Technical_support {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int t = sc.nextInt(); t-- > 0; ) {
            int n = sc.nextInt();
            String s = sc.next();
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'Q') k++;
                else if (k > 0) k--;
            }
            System.out.println(k == 0 ? "YES" : "NO");
        }
    }
}
