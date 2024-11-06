package Codeforces;

import java.util.*;

public class Bouquet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            long m=sc.nextLong(),max=0;
            Map<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++)map.put(arr[i],sc.nextInt());
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                long l=m,s=(long)entry.getValue()*entry.getKey();
                if(s<=l){
                    l-=s;
                    if(map.containsKey(entry.getKey()+1)){
                        long q=(long)(entry.getKey()+1)*map.get(entry.getKey()+1);
                        if(q<=l)l-=q;
                        else{
                            long p=l;
                            l%=(entry.getKey()+1);
                            l-=Math.min(Math.min(map.get(entry.getKey()+1)-(p-l)/(entry.getKey()+1),entry.getValue()),l);
                        }
                    }
                }else{
                    long p=l;
                    l%=entry.getKey();;
                    if(map.containsKey(entry.getKey()+1))l-=Math.min(map.get(entry.getKey()+1),Math.min((p-l)/entry.getKey(),l));
                }
                max=Math.max(max,m-l);
            }
            System.out.println(max);
        }
    }
}