package Codeforces;

import java.util.*;

public class Omkar_and_bad_legend{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            if(arr[0]>=0){
                System.out.println("YES\n"+(arr[n-1]+1));
                for(int i=0;i<=arr[n-1];i++) System.out.print(i+" ");
                System.out.println();
            }else System.out.println("No");
        }
    }
}