package Codeforces;

import java.util.*;
public class Doremi_paint_No_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Map<Integer,Integer>map=new HashMap<>();
            while(n-->0){
                int a=sc.nextInt();
                map.put(a,map.getOrDefault(a,0)+1);
            }
            if(map.size()==1||(map.size()<3&&Math.abs((int)map.values().toArray()[0]-(int)map.values().toArray()[1])<2))System.out.println("Yes");
            else System.out.println("No");
        }
    }
}