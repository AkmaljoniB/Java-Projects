package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Array_reordering {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),x=sc.nextInt();
            int[]a=new int[n],b=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            String s="Yes";
            for (int i=0;i<n;i++) {
                if (a[i]+b[n-i-1]>x) {
                    s="No";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}