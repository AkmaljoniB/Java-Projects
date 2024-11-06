package Codeforces;

import java.util.Scanner;

public class Contest_for_robots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,r=0;
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            if (a[i]!=b){
                if (a[i]==1)l++;
                else r++;
            }
        }
        System.out.println(l==0?-1:r/l+1);
    }
}