package Codeforces;

import java.util.*;

public class Building_an_aquarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long n=sc.nextInt(),x=sc.nextInt(),k,p;
            Map<Long,Long> map=new TreeMap<>();
            for (int i=0;i<n;i++){
                long a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0L)+1);
            }
            k= Collections.min(map.keySet());
            p=map.get(k);
            map.remove(k);
            for(Map.Entry<Long,Long>entry:map.entrySet()){
                if (x-(entry.getKey()-k)*p<=0)break;
                x-=(entry.getKey()-k)*p;
                p+= entry.getValue();
                k=entry.getKey();
            }
            System.out.println(k+x/p);
        }
    }
}