package Codeforces;

import java.util.*;

public class Bmail_company_network{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n+1];
        Set<Integer>set=new TreeSet<>();
        for(int i=2;i<=n;i++)arr[i]=sc.nextInt();
        while(n!=0){
            set.add(n);
            n=arr[n];
        }
        for(Integer a:set)System.out.print(a+" ");
    }
}