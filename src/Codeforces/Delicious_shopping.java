package Codeforces;

import java.util.Scanner;

public class Delicious_shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for (int i=0;i<n;i++)arr[i]=sc.nextInt();
            long k=0,max=-1,l=0,f=0;
            for (int i=0;i<n;i++){
                k+=arr[i];
                l+=arr[i];
                if (i!=n-1)max=Math.max(max,l);
                if (l<=0){
                    f=1;
                    l=0;
                }
            }
            if (f==1)max=Math.max(max,l);
            System.out.println(k>max?"YES":"NO");
        }
    }
}