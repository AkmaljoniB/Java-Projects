package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Significant_mean {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],s=0;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                s+=arr[i];
                if(i>0)s/=2;
            }
            System.out.println(s);
        }
    }
}