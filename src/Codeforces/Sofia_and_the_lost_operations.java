package Codeforces;

import java.util.*;

public class Sofia_and_the_lost_operations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[n];
            Set<Integer>b=new HashSet<>();
            Map<Integer,Integer>map=new HashMap<>();
            for(int i=0;i<n;i++)arr[i]=sc.nextInt();
            for(int i=0;i<n;i++){
                int c=sc.nextInt();
                if(arr[i]!=c)map.put(c,map.getOrDefault(c,0)+1);
                b.add(c);
            }
            int m=sc.nextInt(),d=0;
            for(int i=0;i<m;i++){
                d=sc.nextInt();
                if(map.containsKey(d)){
                    map.put(d,map.get(d)-1);
                    if(map.get(d)==0)map.remove(d);
                }
            }
            System.out.println(map.size()==0&&b.contains(d)?"YES":"NO");
        }
    }
}