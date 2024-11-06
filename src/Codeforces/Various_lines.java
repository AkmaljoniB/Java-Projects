package Codeforces;

import java.util.*;

public class Various_lines{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            Set<String>set=new HashSet<>();
            for(int i=0;i<s.length();i++)set.add(s.charAt(i)+"");
            System.out.println(set.size()==1?"NO":"YES\n"+s.substring(1)+s.charAt(0));
        }
    }
}