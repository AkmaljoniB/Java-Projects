package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0394 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger n= BigInteger.valueOf(sc.nextInt());
        BigInteger m= BigInteger.valueOf(sc.nextInt());
        n=n.divide(n.gcd(m));
        System.out.println(n);
    }
}