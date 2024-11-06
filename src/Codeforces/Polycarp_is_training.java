package Codeforces;

import java.util.*;

public class Polycarp_is_training {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0;
        Map<Integer,Integer>map=new TreeMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())l=Math.min(entry.getValue()+l,entry.getKey());
        System.out.println(l);
    }
}