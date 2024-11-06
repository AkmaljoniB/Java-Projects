package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Pochti_prostie_chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 0;
        for (int i = 6; i <= n; i++) {
            int k = 0;
            for (int j = 2; j <= i; j++) {
                BigInteger a = BigInteger.valueOf(j);
                boolean t = a.isProbablePrime(j);
                BigInteger s = BigInteger.valueOf(i);
                boolean w = s.isProbablePrime(i);
                if (w) {
                    break;
                }
                if (j > i / 2) {
                    if (w) {
                        k++;
                        if (k == 2) {
                            p++;
                        }
                    }
                    break;
                }
                if (t) {
                    if (i % j == 0) {
                        k++;
                    }
                    if (k == 2) {
                        p++;
                        break;
                    }
                }
            }
        }
            System.out.println(p);
    }
}