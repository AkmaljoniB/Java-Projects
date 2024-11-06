package Codeforces;

import java.util.*;

public class They_are_all_the_same{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),min=Integer.MAX_VALUE;
            Set<Integer>set=new TreeSet<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                min=Math.min(min,a);
                set.add(a);
            }
            if(set.size()==1)System.out.println(-1);
            else{
            set.remove(min);
            int res=set.iterator().next();
            set.remove(res);
            res-=min;
            for(Integer a:set)res=gcd(res,a-min);
            System.out.println(res);
            }
        }
    }
    public static int gcd(int a,int b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}