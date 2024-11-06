package Codeforces;

import java.util.*;
public class Largest_divisor_interval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextLong(),i=2;
            for (;i<=n;i++) if (n%i!=0)break;
            System.out.println(i-1);
        }
    }
}
