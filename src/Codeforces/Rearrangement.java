package Codeforces;

import java.util.*;
public class Rearrangement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),m =sc.nextInt();
            while(n-->0)m-=sc.nextInt();
            System.out.println(m==0?"YES":"NO");
}   }   }