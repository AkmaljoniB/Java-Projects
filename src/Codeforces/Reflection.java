package Codeforces;

import java.util.*;

public class Reflection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt(),g=(int)(5*Math.pow(10,(r+"").length()-1));
        if((r+"").charAt(0)-'0'<5)g/=10;
        String p="9999999999";
        long max=g>=l?(long)g*(Long.parseLong(p.substring(0,(g+"").length()))-g):0;
        max=Math.max(max,(Long.parseLong(p.substring(0,(l+"").length()))-l)*l);
        max=Math.max(max,(Long.parseLong(p.substring(0,(r+"").length()))-r)*r);
        System.out.println(max);
    }
}