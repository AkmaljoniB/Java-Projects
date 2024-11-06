package Codeforces;

import java.util.*;

public class Mutually_prime {
    static int gcd(int a,int b){
        if (b==0)return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),max=-1;
            int[]arr=new int[1001];
            for (int i=0;i<n;i++)arr[sc.nextInt()]=i+1;
            for(int i=1;i<1001;i++){
                if (arr[i]!=0){
                    for (int j=1;j<1001;j++){
                        if (arr[j]!=0&&gcd(i,j)==1)max=Math.max(arr[i]+arr[j],max);
                    }
                }
            }
            System.out.println(max);
        }
    }
}