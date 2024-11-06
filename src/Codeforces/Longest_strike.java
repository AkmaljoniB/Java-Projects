package Codeforces;

import java.util.*;

public class Longest_strike{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            Map<Integer,Integer>map=new TreeMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            int pred=-100,l=0,max=0,r=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getValue()>=k){
                    if(entry.getKey()-pred==1)l++;
                    else l=entry.getValue()>=k?1:0;
                    if(max<l){
                        max=l;
                        r=entry.getKey();
                    }
                }else l=0;
                pred=entry.getKey();
            }
            System.out.println(max<1?-1:r-max+1 +" "+r);
        }
    }
}