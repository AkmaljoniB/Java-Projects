package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger a = BigInteger.valueOf(n);
        boolean b = a.isProbablePrime((int) Math.log(n));
        if (b) System.out.println(n-1);
        else {
            int k =0;
            for (int i = 1; i < n; i++) {
                BigInteger c = BigInteger.valueOf(i);
                if (c.gcd(BigInteger.valueOf(n)).equals(BigInteger.ONE))k++;
            }
            System.out.println(k);
        }
    }
}
