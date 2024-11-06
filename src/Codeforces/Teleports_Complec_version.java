package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Teleports_Complec_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter pr =new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),c=sc.nextInt(),p=0,min=Integer.MAX_VALUE,l=0,m1=min,m2=min;
            int[]num=new int[n];
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)num[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                arr[i]=num[i]+i+1;
                if(i<(n+1)/2)m2=Math.min(arr[i],m2);
                if(min>arr[i]){
                    min=arr[i];
                    l=i;
                }
            }
            for(int i=(n+1)/2;i<n;i++){
                arr[i]=num[i]+n-i;
                m1=Math.min(arr[i],m1);
            }
            if(c>=min){
                if(m2+m1>=m2+min||m2==min){
                    c-=min;
                    arr[l]=Integer.MAX_VALUE;
                    p=1;
                }
                int q=c;
                Arrays.sort(arr);
                for(int i=0;i<n;i++){
                    if (c-arr[i]<0) {
                        if(p==1)p=i+1;
                        else p=i;
                        break;
                    }else c-=arr[i];
                }
                if(q!=c&&(p==1||p==0))p=n;
            }
            pr.println(p);
        }
        pr.close();
    }
}