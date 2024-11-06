package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0831{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),max=0,p=-1;
        for(int i=a;i<=b;i++){
            BigInteger c=BigInteger.valueOf(i);
            if(i!=9&&i!=1&&c.isProbablePrime((int)Math.log(i))){
                int s=0,q=i;
                while(q>0){
                    s+=q%10;
                    q/=10;
                }
                if(max<=s){
                    max=s;
                    p=i;
                }
            }
        }
        System.out.println(p);
    }
}