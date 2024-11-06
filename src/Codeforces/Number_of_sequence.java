package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Number_of_sequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long a=sc.nextLong();
            BigInteger p=BigInteger.valueOf(a);
            if (p.isProbablePrime((int) Math.log(a))) System.out.println("1\n"+a);
            else {

            }
        }
    }
}
