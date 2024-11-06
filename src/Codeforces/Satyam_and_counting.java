package Codeforces;

import java.util.*;

public class Satyam_and_counting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l1=0,l2=0;
            long res=0;
            int[]a=new int[n+1],b=new int[n+1];
            for(int i=0;i<n;i++){
                int c=sc.nextInt();
                if(sc.nextInt()==0){
                    a[c]++;
                    l1++;
                }else{
                    b[c]++;
                    l2++;
                }
            }
            for(int i=0;i<=n;i++){
                if(a[i]!=0){
                    if(b[i]==1)res+=l1+l2-2;
                    if(i!=0&&i!=n&&b[i-1]==1&&b[i+1]==1)res++;
                    if(i+2<=n&&a[i+2]==1&&b[i+1]==1)res++;
                }
            }
            System.out.println(res);
        }
    }
}