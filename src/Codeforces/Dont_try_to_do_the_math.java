package Codeforces;

import java.util.Scanner;

public class Dont_try_to_do_the_math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            scanner.next();
            scanner.next();
            String x = scanner.next();
            String s = scanner.next();
            int k = 0;
            while (!x.contains(s)) {
                if (x.length() / 2 > s.length() && k > 1) {
                    k = -1;
                    break;
                }
                x = x.concat(x);
                k++;
            }
            System.out.println(k);
        }
    }
}
