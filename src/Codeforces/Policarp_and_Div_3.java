package Codeforces;

import java.util.Scanner;

public class Policarp_and_Div_3{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=0,i=0,j=0;
        while(i<s.length()){
            if((s.charAt(i)-'0')%3==0){
                l++;
                j=0;
            }else{
                j+=s.charAt(i)-'0';
                if(j%3==0){
                    l++;
                    j=0;
                }
            }
            i++;
        }
        System.out.println(l);
    }
}