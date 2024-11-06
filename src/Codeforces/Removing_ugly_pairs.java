package Codeforces;

import java.util.*;

public class Removing_ugly_pairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Map<String,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++)map.put(s.charAt(i)+"",map.getOrDefault(s.charAt(i)+"",0)+1);
            int l= Collections.max(map.values());
            if (l>=n-l) System.out.println(l-(n-l));
            else System.out.println(s.length()%2==0?0:1);
        }
    }
}