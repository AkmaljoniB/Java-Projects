package Codeforces;

import java.util.*;

public class Scuza {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),q=sc.nextInt(),max=0;long s=0;
            Map<Integer,Long> map=new HashMap<>();
            TreeSet<Integer> set=new TreeSet<>();
            map.put(0, 0L);
            set.add(0);
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                max=Math.max(max,a);
                s+=a;
                if (!map.containsKey(max)){
                    map.put(max,s);
                    set.add(max);
                }else map.put(max,map.get(max)+a);
            }
            while (q-->0)System.out.print(map.get(set.floor(sc.nextInt()))+" ");
            System.out.println();
        }
    }
}
