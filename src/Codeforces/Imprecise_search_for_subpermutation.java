package Codeforces;

import java.util.*;

public class Imprecise_search_for_subpermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt(),l=0,res=0,a[]=new int[n],b[]=new int[m];
            Map<Integer,Integer>map=new HashMap<>(),map2=new HashMap<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(i<m)map2.put(a[i],map2.getOrDefault(a[i],0)+1);
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
                map.put(b[i],map.getOrDefault(b[i],0)+1);
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(map2.containsKey(entry.getKey()))l+=Math.max(entry.getValue()-map2.get(entry.getKey()),0);
                else l+=entry.getValue();
            }
            for(int i=0;i<=n-m;i++){
                if(l<=m-k)res++;
                map2.put(a[i],map2.get(a[i])-1);
                if(map.containsKey(a[i])&&map.get(a[i])>map2.get(a[i]))l++;
                if(i!=n-m){
                    map2.put(a[i+m],map2.getOrDefault(a[i+m],0)+1);
                    if(map.containsKey(a[i+m])&&map.get(a[i+m])>=map2.get(a[i+m]))l--;
                }
            }
            System.out.println(res);
        }
    }
}