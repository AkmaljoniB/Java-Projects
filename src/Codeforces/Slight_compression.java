package Codeforces;

import java.util.Scanner;

public class Slight_compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            String s=sc.next();
            for(int i=s.length()-1;i>0;i--) {
                int a= Integer.parseInt(s.substring(i,i+1)),b=Integer.parseInt(s.substring(i-1,i));
                if (a+b>=10||i==1){
                    System.out.println(s.substring(0,i-1)+(a+b)+s.substring(i+1));
                    break;
                }
            }
        }
    }
}