package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Towers_made_of_cubes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=sc.nextInt();
            Integer[]arr=new Integer[n-1];
            for(int i=0;i<n-1;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++)if(arr[i]>l)l+=(arr[i]-l+1)/2;
            System.out.println(l);
        }
    }
}