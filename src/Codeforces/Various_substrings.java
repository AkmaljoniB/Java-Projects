package Codeforces;

import java.util.*;

public class Various_substrings{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
                int max=0;
                Set<Integer>set=new HashSet<>();
                Map<Integer,Integer>map=new HashMap<>();
                for(int j=i;j<n;j++){
                    set.add(s.charAt(j)-'0');
                    map.put(s.charAt(j)-'0',map.getOrDefault(s.charAt(j)-'0',0)+1);
                    if(map.get(s.charAt(j)-'0')>10)break;
                    else max=Math.max(max,map.get(s.charAt(j)-'0'));
                    if(max<=set.size())k++;
                }
            }
            System.out.println(k);
        }
    }
}
