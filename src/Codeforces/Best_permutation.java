package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Best_permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger a=BigInteger.valueOf(sc.nextInt());
        for(int i=1;i<n;i++)a=a.gcd(BigInteger.valueOf(sc.nextInt()));
        System.out.println(Integer.parseInt(a+"")*n);
    }
}