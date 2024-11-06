package Codeforces;

import java.util.*;

public class The_world_is_mine{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0,l=0;
            Map<Integer,Integer>map=new TreeMap<>();
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            List<Integer>list=new ArrayList<>(),a=new ArrayList<>();
            for(Map.Entry<Integer,Integer>entry:map.entrySet())list.add(entry.getValue());
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if(!a.contains(entry.getValue())){
                    k++;
                    l++;
                    list.remove(entry.getValue());
                }else a.remove(entry.getValue());
                if(list.contains(l)){
                    a.add(l);
                    list.remove((Object)l);
                    l=0;
                }
            }

            System.out.println(k);
        }
    }
}
//9
//4 3 5 6 6 6 4 8 5
