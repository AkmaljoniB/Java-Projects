package Codeforces;

import java.util.*;

public class Time_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int l=Integer.parseInt(s.substring(0,2));
            if(l>11){
                if(l==12)System.out.println(s+" PM");
                else System.out.println(l-12<10?"0"+(l-12)+":"+s.substring(3,5)+" PM":(l-12)+":"+s.substring(3,5)+" PM");
            }else {
                if(l==0) System.out.println("12:"+s.substring(3,5)+" AM");
                else System.out.println(s+" AM");
            }
        }
    }
}