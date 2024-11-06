package Codeforces;

import java.util.*;

public class Removing_two_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long s=0,k=0;
            Map<Long,Integer>map=new TreeMap<>();
            for(int i=0;i<n;i++){
                long a=sc.nextInt();
                s+=a;
                map.put(a,map.getOrDefault(a,0)+1);
            }
            long p=(int)((double)s/n*2);
            if((double)s/n*2==(int)((double)s/n*2)){
                for(Map.Entry<Long,Integer>entry:map.entrySet()){
                    if(entry.getKey()>=(p+1)/2)break;
                    if(map.containsKey(p-entry.getKey()))k+=(long)entry.getValue()*map.get(p-entry.getKey());
                }
                if(p%2==0&&map.containsKey(p/2))k+=(long)map.get(p/2)*(map.get(p/2)-1)/2;
            }
            System.out.println(k);
        }
    }
}