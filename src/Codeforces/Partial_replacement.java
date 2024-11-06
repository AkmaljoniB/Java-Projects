package Codeforces;

import java.util.Scanner;

public class Partial_replacement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            String s=sc.next();
            int l=s.indexOf("*")!=s.lastIndexOf("*")?2:1;
            for(int i=s.indexOf("*")+1;i+k<=s.lastIndexOf("*")&&i<s.lastIndexOf("*");){
                String p=s.substring(i,i+k);
                i+=p.lastIndexOf("*")+1;
                l++;
            }
            System.out.println(l);
        }
    }
}