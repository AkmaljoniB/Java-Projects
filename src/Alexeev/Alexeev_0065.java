package Alexeev;

import java.util.*;

public class Alexeev_0065{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        Map<Integer,String>map=new TreeMap<>();
        for(int j=1;j<=n;j++){
            String p=sc.next();
            int l=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=p.charAt(i))l++;
            }
            if(!map.containsKey(l))map.put(l,j+"");
            else map.put(l,map.get(l)+" "+j);
        }
        if(map.size()!=0){
            String p=(String)map.values().toArray()[0];
            System.out.println(p.length()-p.replace(" ","").length()+1);
            System.out.println(p);
        }else System.out.println(0);
    }
}