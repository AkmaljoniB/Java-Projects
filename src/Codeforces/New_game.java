package Codeforces;

import java.util.*;

public class New_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),prev=-1,p=0;
            Map<Integer,Integer>map=new TreeMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            long s=0,max=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(entry.getKey()-prev==1){
                    s+=entry.getValue();
                    if(entry.getKey()-k>=p)s-=map.get(entry.getKey()-k);
                }else{
                    s=entry.getValue();
                    p=entry.getKey();
                }
                max=Math.max(max,s);
                prev=entry.getKey();
            }
            System.out.println(max);
        }
    }
}