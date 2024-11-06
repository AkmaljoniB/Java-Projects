package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Fadi_and_Noc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger x=BigInteger.valueOf(sc.nextLong()),a=x.sqrt();
        while (true){
            BigInteger b=x.divide(a);
            if (a.divide(a.gcd(b)).multiply(b).equals(x)){
                System.out.print(b+" "+a);
                break;
            }
            a=a.subtract(BigInteger.ONE);
        }
    }
}