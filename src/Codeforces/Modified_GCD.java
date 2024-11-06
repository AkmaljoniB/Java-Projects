package Codeforces;

import java.util.Scanner;
import java.util.TreeSet;

public class Modified_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),gc=gcd(a,b);
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=1;i*i<=gc;i++) {
            if(a%i==0&&b%i==0) {
                set.add(i);
                set.add(gc/i);
            }
        }
        set.add(gc);
        while(n-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            Integer q=set.floor(r);
            System.out.println(q!=null&&q>=l?q:-1);
        }
    }
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}