package Alexeev;

import java.util.*;

public class Alexeev_0250{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            Set<Character>a=new HashSet<>(),b=new HashSet<>();
            String s=(n-i)+"",p=(n+i)+"";
            for(int j=0;j<s.length();j++)a.add(s.charAt(j));
            for(int j=0;j<p.length();j++)b.add(p.charAt(j));
            if(a.size()<3){
                System.out.println(n-i);
                break;
            }else if(b.size()<3){
                System.out.println(n+i);
                break;
            }
        }
    }
}