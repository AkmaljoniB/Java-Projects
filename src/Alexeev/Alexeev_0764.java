package Alexeev;

import java.util.*;

public class Alexeev_0764{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        Map<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            double x=sc.nextInt(),y=sc.nextInt();
            if(x>=0&&y>=0)map.put("1 "+x/y,map.getOrDefault("1 "+x/y,0)+1);
            else if(x<=0&&y>=0)map.put("2 "+x/y,map.getOrDefault("2 "+x/y,0)+1);
            else if(x<=0)map.put("3 "+x/y,map.getOrDefault("3 "+x/y,0)+1);
            else map.put("4 "+x/y,map.getOrDefault("4 "+x/y,0)+1);
        }
        for(Map.Entry<String,Integer>entry:map.entrySet())max=Math.max(max,entry.getValue());
        System.out.println(max);
    }
}