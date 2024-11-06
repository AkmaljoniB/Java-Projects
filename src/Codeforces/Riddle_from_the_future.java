package Codeforces;

import java.util.Scanner;

public class Riddle_from_the_future {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String b = sc.next();
            int k = 0, l = 0;
            for (int i = 0; i < n; i++) {
                String p = "0";
                if (b.charAt(i) == '1') {
                    if (k == 0) {
                        p = "1";
                        l = 0;
                    } else l = 1;
                    k ^= 1;
                } else if (b.charAt(i) == '0') {
                    if (l == 0) {
                        p = "1";
                        k=0;
                    }
                    l ^= 1;
                }
                System.out.print(p);
            }
            System.out.println();
        }
    }
}
