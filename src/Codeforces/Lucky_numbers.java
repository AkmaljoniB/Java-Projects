package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Lucky_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        BigInteger s = BigInteger.ZERO;
        for (int i = 1; i<=n;i++)s=s.add(BigInteger.TWO.pow(i));
        System.out.println(s);
    }
}