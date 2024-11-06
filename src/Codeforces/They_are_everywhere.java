package Codeforces;

import java.util.*;

public class They_are_everywhere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        Map<String,TreeSet<Integer>>map=new HashMap<>();
        for(int i=0;i<n;i++){
            if (!map.containsKey(s.charAt(i)+""))map.put(s.charAt(i)+"",new TreeSet<>());
            map.get(s.charAt(i)+"").add(i);
        }
        int min=n;
        out:for(int i=0;i<n;i++){
            int max=0;
            for(Map.Entry<String,TreeSet<Integer>>entry:map.entrySet()){
                if(entry.getValue().size()!=0){
                    max=Math.max(entry.getValue().first(),max);
                    if (entry.getValue().first()==i)entry.getValue().pollFirst();
                }else break out;
            }
            min=Math.min(min,max-i+1);
        }
        System.out.println(min);
    }
}