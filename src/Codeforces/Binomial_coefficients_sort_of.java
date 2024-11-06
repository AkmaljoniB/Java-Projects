package Codeforces;

import java.util.*;

public class Binomial_coefficients_sort_of {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),arr[]=new int[100001];
        arr[0]=1;
        for(int i=1;i<100001;i++)arr[i]=(arr[i-1]*2)%((int)(1e9)+7);
        for(int i=0;i<t;i++)sc.nextInt();
        for(int i=0;i<t;i++)System.out.println(arr[sc.nextInt()]);
    }
}