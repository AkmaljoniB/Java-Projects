package Codeforces;

import java.util.Scanner;

public class Send_messages {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;) {
            int n=sc.nextInt(),f=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
            int l=0;
            String p="YES";
            for (int i=0;i<n;i++) {
                int m=sc.nextInt();
                long min= (long) (m - l) *a;
                min =Math.min(min,b);
                if (min<f)f-=min;
                else p="NO";
                l=m;
            }
            System.out.println(p);
        }
    }
}
