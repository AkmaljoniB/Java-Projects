package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0847{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char[]s=sc.next().toCharArray(),p=sc.next().toCharArray();
        String t="NO";
        if(s.length==p.length){
            int l=0;
            for(int i=0;i<s.length;i++){
                if(s[i]==p[i]){
                    l++;
                    break;
                }
            }
            if(l==0){
                Arrays.sort(s);
                Arrays.sort(p);
                t="YES";
                for(int i=0;i<s.length;i++){
                    if(s[i]!=p[i]){
                        t="NO";
                        break;
                    }
                }
            }
        }
        System.out.println(t);
    }
}