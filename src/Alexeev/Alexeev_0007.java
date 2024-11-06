package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();
        BigInteger d, e ;
        d = a.max(b);
        e = d.max(c);
        System.out.println(e);
    }
}
