package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Various_dividers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int d = scanner.nextInt();
            long c = 0,e;
            int p =d;
            while (true) {
                d++;
                BigInteger a = BigInteger.valueOf(d);
                boolean is = a.isProbablePrime((int) Math.log(d));
                if (is) {
                    if (c == 0) {
                        c = Long.parseLong(String.valueOf(a));
                        d+=p-1;
                    } else {
                        e = Long.parseLong(String.valueOf(a));
                        break;
                    }
                }
            }
            System.out.println(c * e);
        }
    }
}
