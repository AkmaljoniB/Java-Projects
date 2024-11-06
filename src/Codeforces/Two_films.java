package Codeforces;

import java.util.Scanner;

public class Two_films {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),a[]=new int[n],b[]=new int[n],s1=0,s2=0,l1=0,l2=0;
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                if(a[i]>b[i])s1+=a[i];
                else if(a[i]<b[i])s2+=b[i];
                else{
                    if(a[i]==-1)l1++;
                    else if(a[i]==1)l2++;
                }
            }
            int min=Math.min(Math.abs(s1-s2),l1);
            if(s1>s2)s1-=min;
            else s2-=min;
            l1-=min;
            if(l1!=0){
                s1-=l1/2;
                s2-=(l1+1)/2;
            }
            min=Math.min(Math.abs(s2-s1),l2);
            if(s1<s2)s1+=min;
            else s2+=min;
            l2-=min;
            if(l2!=0){
                s1+=l2/2;
                s2+=l2/2;
            }
            System.out.println(Math.min(s1,s2));
        }
    }
}