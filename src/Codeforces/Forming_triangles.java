package Codeforces;

import java.util.*;

public class Forming_triangles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer>map=new HashMap<>();
            for (int i = 0; i < n; i++) {
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            long l=0,p=0;
            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                if (entry.getValue()>2){
                    for (int i=1;i<=entry.getValue()-2; i++) l+= (long) (entry.getValue()-i-1) *i;
                }
                if (entry.getValue()>1) l += ((long) entry.getValue() * (entry.getValue()-1) / 2 * p);
                p+=entry.getValue();
            }
            System.out.println(l);
        }
    }
}