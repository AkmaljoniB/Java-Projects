package Codeforces;

import java.util.*;

public class Array_with_zero_remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            long v=0,l=0;
            Map<Integer,Integer> map= new TreeMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a%k!=0) map.put(a%k,map.getOrDefault(a%k,0)+1);
            }
            for (Map.Entry<Integer,Integer>entry:map.entrySet()) {
                if (entry.getValue()>v){
                    v= entry.getValue();
                    l= entry.getKey();
                }
            }
            System.out.println(map.size()==0?0:v*k-l+1);
        }
    }
}