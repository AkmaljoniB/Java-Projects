package Codeforces;

import java.util.*;

public class Matryoshka_dolls{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,k=0,p=0;
            Map<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getKey()-p!=1)l=0;
                if(entry.getValue()>l)k+=entry.getValue()-l;
                l=entry.getValue();
                p=entry.getKey();
            }
            System.out.println(k);
        }
    }
}