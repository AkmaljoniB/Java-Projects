package Alexeev;

import java.util.*;

public class Alexeev_0689 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),j=2;
            String p=Integer.toString(n,2);
            for(int i=3;i<37;i++){
                String s=Integer.toString(n,i);
                Set<Integer>set1=new HashSet<>();
                Set<Integer>set2=new HashSet<>();
                for(int o=0;o<p.length();o++)set1.add(p.charAt(o)-'0');
                for(int o=0;o<s.length();o++)set2.add(s.charAt(o)-'0');
                if(set2.size()+s.length()<set1.size()+p.length()){
                    p=s;
                    j=i;
                }
            }
            System.out.println(j+" "+p.toUpperCase());
        }
    }
}