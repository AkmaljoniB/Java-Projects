package Codeforces;

import java.util.*;

public class Put_them_on_quickly{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),a[]=new int[n],l=0,k=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;l<n&&i<m;i++){
            int b=sc.nextInt();
            if(a[l]-x<=b&&b<=a[l]+y){
                k++;
                sb.append((l+1)+" "+(i+1)+"\n");
                l++;
            }else{
                while(l<n&&a[l]+y<b)l++;
                if(l<n&&a[l]-x<=b&&b<=a[l]+y){
                    k++;
                    sb.append((l+1)+" "+(i+1)+"\n");
                    l++;
                }
            }
        }
        System.out.println(k);
        System.out.println(sb);
    }
}