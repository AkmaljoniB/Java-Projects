package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        BigInteger a=BigInteger.ONE,b=BigInteger.ONE,c=BigInteger.ONE,s=BigInteger.ONE;
        for (int i=1;i<k;i++){
            s=s.add(a);
            a=a.add(b);
            b=c;
            c=a;
        }
        System.out.println(s);
    }
}