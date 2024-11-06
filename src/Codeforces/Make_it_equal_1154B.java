package Codeforces;

import java.util.*;

public class Make_it_equal_1154B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=-1;
        TreeSet<Integer>set=new TreeSet<>();
        for(int i=0;i<n;i++)set.add(sc.nextInt());
        if(set.size()<4){
            int a=set.pollFirst(),b=set.size()==0?a:set.pollFirst(),c=-1;
            if(set.size()==1)c=set.pollFirst();;
            if(c!=-1){
                if(b-a==c-b)l=b-a;
            }else if((b-a)%2==0)l=(b-a)/2;
            else l=b-a;
        }
        System.out.println(l);
    }
}