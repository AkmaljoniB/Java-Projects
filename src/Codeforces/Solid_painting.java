package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class Solid_painting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Long[]arr=new Long[n];
            for (int i=0;i<n;i++) arr[i]=sc.nextLong();
            BigInteger a=BigInteger.valueOf(arr[0]);
            BigInteger b=BigInteger.valueOf(arr[1]);
            for (int i=2;i<n; i++) {
                if (i%2==0)a=a.gcd(BigInteger.valueOf(arr[i]));
                else b=b.gcd(BigInteger.valueOf(arr[i]));
            }
            Long c= Long.valueOf(a+""),d= Long.valueOf((b+""));
            int p=1;
            for (int i=0;i<n;i+=2) {
                if (arr[i]%d==0){
                    p=0;
                    break;
                }
            }
            if (p==1) System.out.println(d);
            else {
                p=1;
                for (int i=1;i<n;i+=2) {
                    if (arr[i]%c==0){
                        p=0;
                        break;
                    }
                }
                System.out.println(p==0?0:c);
            }
        }
    }
}