package Codeforces;

import java.util.*;

public class Ball_in_Berland{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),k=sc.nextInt();
            long p=0;
            Map<Integer,Integer>map=new HashMap<>();
            Map<Integer,Set<Integer>>ma=new HashMap<>();
            Map<Integer,Integer>m=new HashMap<>();
            int[]arr=new int[k];
            for(int i=0;i<k;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                if(!ma.containsKey(arr[i]))ma.put(arr[i],new HashSet<>());
            }
            for(int i=0;i<k;i++){
                int c=sc.nextInt();
                ma.get(arr[i]).add(c);
                m.put(c,m.getOrDefault(c,0)+1);
            }
            for(Map.Entry<Integer,Set<Integer>>entry:ma.entrySet()){
                for(Integer q:entry.getValue())p+=(k-map.get(entry.getKey())-m.get(q)+1);
            }
            System.out.println(p/2);
        }
    }
}