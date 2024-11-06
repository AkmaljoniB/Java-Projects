package Codeforces;

import java.util.*;
public class Found_different {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),a=sc.nextInt();
            TreeSet<Integer>set=new TreeSet<>();
            for (int i=1;i<n;i++) {
                int b=sc.nextInt();
                if (a!=b){
                    set.add(i);
                    if (i==n-1)set.add(n);
                }
                a=b;
            }
            int q=sc.nextInt();
            while (q-->0){
                int l=sc.nextInt(),r=sc.nextInt();
                Integer w=set.ceiling(l);
                if (w!=null&&w<r) System.out.println(w+" "+(w+1));
                else System.out.println("-1 -1");
            }
        }
    }
}