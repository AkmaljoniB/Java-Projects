package Codeforces;

import java.util.*;

public class Conformities_by_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a=new int[n+1],b=new int[n+1];
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=1;i<=n;i++) a[sc.nextInt()]=i;
        for (int i=1;i<=n;i++) b[sc.nextInt()]=i;
        for (int i=1;i<=n;i++){
            int q=a[i]-b[i];
            if (q<0)q+=n;
            map.put(q,map.getOrDefault(q,0)+1);
        }
        System.out.println(Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getValue());
    }
}