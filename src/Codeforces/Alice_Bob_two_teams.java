package Codeforces;

import java.util.Scanner;

public class Alice_Bob_two_teams{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long max=0,sum=0,l=0;
        int[]arr=new int[n];
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        String s=sc.next();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A')l+=arr[i];
            else{
                max=Math.max(max,l);
                sum+=arr[i];
                l-=arr[i];
            }
        }
        max=Math.max(max,l);
        l=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='A')l+=arr[i];
            else{
                max=Math.max(max,l);
                l-=arr[i];
            }
        }
        System.out.println(sum+Math.max(max,l));
    }
}