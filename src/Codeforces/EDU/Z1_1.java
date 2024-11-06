package Codeforces.EDU;

import java.util.*;

public class Z1_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            StringBuilder sb;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)==s.charAt(0)){
                    sb=new StringBuilder(s.substring(0,i+1));
                    sb.reverse();
                    if(s.substring(0,i+1).contentEquals(sb)){
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}