package Codeforces;

import java.util.*;

public class Reposts{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=1;
        Map<String,Integer> map=new HashMap<>();
        map.put("polycarp",1);
        for(int i=0;i<n;i++){
            String n1=sc.next().toLowerCase();
            sc.next();
            String n2=sc.next().toLowerCase();
            map.put(n1,map.get(n2)+1);
            max=Math.max(max,map.get(n1));
        }
        System.out.println(max);
    }
}