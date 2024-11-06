package Codeforces;

import java.util.*;

public class Tinctures_simple_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Long>pq=new PriorityQueue<>(n);
        long s=0;
        for(int i=1;i<=n;i++){
            long x=sc.nextLong();
            s+=x;
            pq.add(x);
            while(s<0) s-=pq.poll();
        }
        System.out.println(pq.size());
    }
}