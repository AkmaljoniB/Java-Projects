package Codeforces;

import java.util.*;

public class Epic_transformation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer> map=new HashMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            int max=Collections.max(map.values());
            System.out.println(n-max>=max?n%2!=0?1:0:max-n+max);
        }
    }
}