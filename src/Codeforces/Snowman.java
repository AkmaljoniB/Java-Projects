package Codeforces;

import java.util.*;

public class Snowman{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=n,arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[sc.nextInt()]++;
            while(arr[l]==1){
                System.out.print(l+" ");
                l--;
            }
            System.out.println();
        }
    }
}