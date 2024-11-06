package Codeforces;

import java.util.Scanner;

public class Maximize_the_remaining_element {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n],max=0;
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i+=2)max=Math.max(arr[i],max);
            System.out.println(max);
        }
    }
}