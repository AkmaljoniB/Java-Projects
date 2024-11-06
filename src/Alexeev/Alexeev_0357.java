package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0357 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        int b= 11;
        if (a.mod(BigInteger.valueOf(b)).equals(BigInteger.valueOf(0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}