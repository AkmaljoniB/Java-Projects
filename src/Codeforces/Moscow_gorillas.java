package Codeforces;

import java.util.*;

public class Moscow_gorillas{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n+1],b=new int[n+1];
        for(int i=0;i<n;i++)a[sc.nextInt()]=i;
        for(int i=0;i<n;i++)b[sc.nextInt()]=i;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}