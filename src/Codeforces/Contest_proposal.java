package Codeforces;

import java.util.Scanner;

public class Contest_proposal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0;
            int a[]=new int[n],b[]=new int[n];
            for(int i=0;i<n;i++)a[i]=sc.nextInt();
            for(int i=0;i<n;i++)b[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                int f=n;
                for(int j=i;j<n;j++){
                    if(a[i]<=b[j]){
                        f=j;
                        break;
                    }
                }
                max=Math.max(max,f-i);
            }
            System.out.println(max);
        }
    }
}