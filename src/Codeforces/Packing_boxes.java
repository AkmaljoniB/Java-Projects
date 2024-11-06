package Codeforces;

import java.util.*;

public class Packing_boxes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,Integer> map=new TreeMap<>();
        for (int i=0;i<n; i++) {
            int a=sc.nextInt();
            map.put(a,map.getOrDefault(a,0)+1);
        }
        System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue());
    }
}