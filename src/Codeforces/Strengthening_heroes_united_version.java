package Codeforces;

import java.util.*;

public class Strengthening_heroes_united_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long s=0;
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
            for (int i=0;i<n; i++) {
                int a=sc.nextInt();
                if (a==0&&!pq.isEmpty())s+=pq.poll();
                else pq.add(a);
            }
            System.out.println(s);
        }
    }
}