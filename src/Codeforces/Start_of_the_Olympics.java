package Codeforces;

import java.util.*;

public class Start_of_the_Olympics{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0) {
            long n=sc.nextLong(),x=sc.nextLong(),t=sc.nextLong();
            System.out.println(t/x<=n?t/x*(n-t/x)+(t/x)*(t/x-1)/2:n*(n-1)/2);
        }
    }
}