package Codeforces;

import java.util.*;

public class Maximizing_the_number_of_zeros{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),arr[]=new int[n],l=0;
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),g=gcd(a,arr[i]);
            if(a==arr[i]&&a==0)l++;
            if(arr[i]!=0)map.put((a/g)+" "+(arr[i]/g),map.getOrDefault((a/g)+" "+(arr[i]/g),0)+1);
        }
        System.out.println(map.size()==0?l:Collections.max(map.values())+l);
    }
    public static int gcd(int a,int b) {
        if (b==0)return a;
        return gcd(b,a%b);
    }
}