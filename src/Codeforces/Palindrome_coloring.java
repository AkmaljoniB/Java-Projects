package Codeforces;

import java.util.*;

public class Palindrome_coloring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0,p=0;
            String s=sc.next();
            Map<String,Integer>map=new HashMap<>();
            for(int i=0;i<s.length();i++)map.put(s.charAt(i)+"",map.getOrDefault(s.charAt(i)+"",0)+1);
            for(Map.Entry<String,Integer>entry:map.entrySet()){
                l+=entry.getValue()%2;
                p+=entry.getValue()-entry.getValue()%2;
            }
            System.out.println(p/k%2==0&&l+p%k>=k?p/k+1:Math.max(p/k,1));
        }
    }
}