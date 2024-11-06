package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Choice_cubes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),f=sc.nextInt(),k=sc.nextInt(),l;
            Integer[]arr=new Integer[n];
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            l=arr[f-1];
            Arrays.sort(arr);
            String s="No";
            if(arr[n-k]==l&&n-k!=0&&arr[n-k-1]==l)s="Maybe";
            else if(arr[n-k]<=l)s="Yes";
            System.out.println(s);
        }
    }
}