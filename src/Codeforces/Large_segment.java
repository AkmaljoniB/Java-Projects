package Codeforces;

import java.util.Scanner;

public class Large_segment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),min=Integer.MAX_VALUE,max=0,k=-1;
        int[]a=new int[n],b=new int[n];
        for (int i=0;i<n;i++) {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            min=Math.min(min,a[i]);
            max=Math.max(max,b[i]);
        }
        for (int i=0;i<n;i++) {
            if (min==a[i]&&max==b[i]){
                k=i+1;
                break;
            }
        }
        System.out.println(k);
    }
}
