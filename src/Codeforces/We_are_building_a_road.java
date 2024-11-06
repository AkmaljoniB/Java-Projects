package Codeforces;

import java.util.Scanner;

public class We_are_building_a_road{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),i=0;
        int[]arr=new int[n+1];
        for(;i<2*m;i++)arr[sc.nextInt()]++;
        for(i=1;i<=n;i++)if(arr[i]==0)break;
        System.out.println(n-1);
        for(int j=1;j<=n;j++)System.out.print(i!=j?j+" "+i+"\n":"");
    }
}