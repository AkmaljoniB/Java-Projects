package Codeforces;

import java.util.*;

public class Symmetric_coding{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            Set<String>set=new TreeSet<>();
            for(int i=0;i<n;i++)set.add(s.charAt(i)+"");
            List<String>list=new ArrayList<>(set);
            for(int i=0;i<n;i++)System.out.print(list.get(set.size()-list.indexOf(s.charAt(i)+"")-1));
            System.out.println();
        }
    }
}