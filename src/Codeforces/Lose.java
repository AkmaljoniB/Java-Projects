package Codeforces;

import java.util.*;

public class Lose{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<Integer,TreeSet<Integer>>map=new TreeMap<>();
        map.put(4,new TreeSet<>());
        map.put(8,new TreeSet<>());
        map.put(15,new TreeSet<>());
        map.put(16,new TreeSet<>());
        map.put(23,new TreeSet<>());
        map.put(42,new TreeSet<>());
        for(int i=0;i<n;i++)map.get(sc.nextInt()).add(i);
        int s=0;
        out:while(true){
            int l=-1,i=0;
            for(Map.Entry<Integer,TreeSet<Integer>>entry:map.entrySet()){
                Integer p=entry.getValue().ceiling(l);
                if(p==null){
                    s+=i;
                    break out;
                }
                l=p;
                entry.getValue().remove(l);
                i++;
            }
        }
        for(Map.Entry<Integer,TreeSet<Integer>>entry:map.entrySet())s+=entry.getValue().size();
        System.out.println(s);
    }
}