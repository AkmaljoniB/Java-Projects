package Codeforces;

import java.util.Scanner;

public class Boxed_halloumi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int a = scanner.nextInt();
            String s ="YES";
            for (int i = 1; i < n; i++) {
                int b = scanner.nextInt();
                if(a>b)s="NO";
                a=b;
            }
            if (k > 1 ||s.equals("YES")) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
