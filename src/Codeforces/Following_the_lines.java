package Codeforces;

import java.util.*;

public class Following_the_lines {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String a="abcdefghijklnmopqrstuvwxyz";
            Map<Integer, List<String>> map=new HashMap<>();
            map.put(0,new ArrayList<>());
            for (int i=0;i<26;i++)map.get(0).add(a.substring(i,i+1));
            for (int i=0;i<n;i++) {
                int b=sc.nextInt();
                System.out.print(map.get(b).get(0));
                if (!map.containsKey(b+1))map.put(b+1,new ArrayList<>());
                map.get(b+1).add(map.get(b).get(0));
                map.get(b).remove(0);
            }
            System.out.println();
        }
    }
}