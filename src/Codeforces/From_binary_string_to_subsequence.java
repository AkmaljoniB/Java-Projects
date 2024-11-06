package Codeforces;

import java.util.*;

public class From_binary_string_to_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0,l=0,r=0;
            String s=sc.next();
            StringBuilder sb=new StringBuilder();
            Map<Integer,Queue<Integer>> map=new HashMap<>();
            map.put(1,new PriorityQueue<>());
            map.put(0,new PriorityQueue<>());
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    if(l==0){
                        k++;
                        map.get(1).add(k);
                        sb.append(k+" ");
                    } else {
                        l--;
                        int q=map.get(0).poll();
                        sb.append(q+" ");
                        map.get(1).add(q);
                    }
                    r++;
                } else {
                    if(r==0){
                        k++;
                        map.get(0).add(k);
                        sb.append(k+" ");
                    } else {
                        r--;
                        int q=map.get(1).poll();
                        sb.append(q+" ");
                        map.get(0).add(q);
                    }
                    l++;
                }
            }
            System.out.println(k+"\n"+sb);
        }
    }
}