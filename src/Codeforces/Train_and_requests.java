package Codeforces;

import java.util.*;

public class Train_and_requests {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            Map<Integer,int[]>map=new HashMap<>();
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (!map.containsKey(a)){
                    map.put(a,new int[2]);
                    map.get(a)[0]=i;
                }
                map.get(a)[1]=Math.max(i,map.get(a)[1]);
            }
            while (m-->0){
                int a=sc.nextInt(),b=sc.nextInt();
                System.out.println(map.containsKey(a)&&map.containsKey(b)&&map.get(a)[0]<map.get(b)[1]?"YES":"NO");
            }
        }
    }
}