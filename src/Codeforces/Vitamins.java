package Codeforces;

import java.util.*;

public class Vitamins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++) {
            int a=sc.nextInt();
            String[]ars=sc.next().split("");
            Arrays.sort(ars);
            String p="";
            for (String ar : ars) p = p.concat(ar);
            if (!map.containsKey(p))map.put(p,a);
            map.put(p,Math.min(a,map.get(p)));
        }
        int min=Integer.MAX_VALUE;
        if (map.containsKey("A")&&map.containsKey("B")&&map.containsKey("C"))min=map.get("A")+map.get("B")+map.get("C");
        if (map.containsKey("AB")&&map.containsKey("BC"))min=Math.min(map.get("AB")+map.get("BC"),min);
        if (map.containsKey("AB")&&map.containsKey("AC"))min=Math.min(map.get("AB")+map.get("AC"),min);
        if (map.containsKey("AB")&&map.containsKey("C"))min=Math.min(min,map.get("C")+map.get("AB"));
        if (map.containsKey("BC")&&map.containsKey("A"))min=Math.min(min,map.get("A")+map.get("BC"));
        if (map.containsKey("BC")&&map.containsKey("AC"))min=Math.min(min,map.get("BC")+map.get("AC"));
        if (map.containsKey("BC")&&map.containsKey("AB"))min=Math.min(min,map.get("BC")+map.get("AB"));
        if (map.containsKey("B")&&map.containsKey("AC"))min=Math.min(min,map.get("B")+map.get("AC"));
        if (map.containsKey("ABC"))min=Math.min(min,map.get("ABC"));
        System.out.println(min==Integer.MAX_VALUE?-1:min);
    }
}