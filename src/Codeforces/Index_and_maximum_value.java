package Codeforces;

import java.util.Scanner;

public class Index_and_maximum_value{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),max=0;
            for(int i=0;i<n;i++)max=Math.max(max,sc.nextInt());
            while(m-->0){
                String s=sc.next();
                int l=sc.nextInt(),r=sc.nextInt();
                if(max>=l&&max<=r){
                    if(s.charAt(0)=='+')max++;
                    else max--;
                }
                System.out.print(max+" ");
            }
            System.out.println();
        }
    }
}