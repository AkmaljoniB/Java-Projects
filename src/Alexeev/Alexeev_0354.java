package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0354{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=2;
        while(n!=1){
            if(n%l==0){
                n/=l;
                System.out.print(n==1?l:l+"*");
            }else{
                BigInteger a=BigInteger.valueOf(n);
                if(n!=9&&a.isProbablePrime((int)Math.log(n)))l=n;
                else l++;
            }
        }
    }
}