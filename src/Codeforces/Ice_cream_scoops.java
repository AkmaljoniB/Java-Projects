package Codeforces;

import java.util.Scanner;

public class Ice_cream_scoops{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),l=(long)Math.sqrt(n*2);
            System.out.println(l*(l+1)/2<=n?l+n-l*(l+1)/2+1:l+n-l*(l-1)/2);
        }
    }
}