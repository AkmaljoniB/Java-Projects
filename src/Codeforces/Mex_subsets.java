package Codeforces;

import java.util.*;
public class Mex_subsets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),l=-1;
            int[]arr=new int[101];
            for (int i=0;i<n;i++) arr[sc.nextInt()]++;
            for (int i=0;i<=100;i++) {
                if (l==-1 &&arr[i]<2)l=i;
                if (arr[i]==0){
                    l+=i;
                    break;
                }
            }
            System.out.println(l);
        }
    }
}
