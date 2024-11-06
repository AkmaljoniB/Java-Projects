package Codeforces;

import java.util.Scanner;

public class Two_screens {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            String p=sc.next();
            int l=0;
            while(l<Math.min(s.length(),p.length())){
                if(s.charAt(l)==p.charAt(l))l++;
                else break;
            }
            int k=l!=0?1:0;
            System.out.println(l+s.length()-l+p.length()-l+k);
        }
    }
}