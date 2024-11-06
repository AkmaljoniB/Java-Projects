package Codeforces;

import java.util.*;

public class Skating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0;
        Map<Integer,Set<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(!map.containsKey(a))map.put(a,new HashSet<>());
            map.get(a).add(sc.nextInt());
        }
        while(map.size()!=0){
            l++;
            Set<Integer>set=new HashSet<>();
            for (Map.Entry<Integer, Set<Integer>>entry:map.entrySet()){
                set.addAll(entry.getValue());
                map.remove(entry.getKey());
                break;
            }
            while(true){
                List<Integer>list=new ArrayList<>();
                for (Map.Entry<Integer,Set<Integer>>entry:map.entrySet()){
                    Set<Integer>p=new HashSet<>(set);
                    p.addAll(entry.getValue());
                    if(p.size()!=set.size()+entry.getValue().size()){
                        set=p;
                        list.add(entry.getKey());
                    }
                }
                if (list.size()==0)break;
                for (Integer integer:list)map.remove(integer);
            }
        }
        System.out.println(l-1);
    }
}