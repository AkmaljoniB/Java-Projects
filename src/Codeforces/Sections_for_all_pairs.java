package Codeforces;

import java.util.*;

public class Sections_for_all_pairs{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),q=sc.nextInt(),x[]=new int[n];
            Map<Long,Long>map=new HashMap<>();
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
                long l=n-i-1+((long)i*(n-i)),p;
                map.put(l,map.getOrDefault(l,0L)+1);
                if(i!=0){
                    p=x[i]-x[i-1]-1;
                    if(p!=0){
                        if(map.containsKey(l-(n-i-1)))map.put(l-(n-i-1),map.get(l-(n-i-1))+p);
                        else map.put(l-(n-i-1),p);
                    }
                }
            }
            while(q-->0){
                long k=sc.nextLong();
                System.out.print(map.getOrDefault(k, 0L)+" ");
            }
            System.out.println();
        }
    }
}