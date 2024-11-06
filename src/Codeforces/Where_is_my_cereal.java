package Codeforces;

import java.util.Scanner;
public class Where_is_my_cereal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),l=-1,r=n+1;
        for (int i=0;i<m;i++) {
            sc.next();sc.next();
            String s=sc.next();sc.next();
            int p=sc.nextInt();
            if (s.equals("right"))l=Math.max(p,l);
            else r=Math.min(r,p);
        }
        if (l==-1) System.out.println(r-1==0?-1:r-1);
        else if (r==n+1&&l!=r-1) System.out.println(r-l-1);
        else System.out.println(r-l<2?-1:r-l-1);
    }
}