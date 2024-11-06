package Codeforces;

import java.util.*;

public class Rearranging_an_Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a[]=new int[n],l=0;
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]>a[l])l++;
        }
        System.out.println(l);
    }
}