package Codeforces;

import java.util.Scanner;

public class Substring_and_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next(),b=sc.next();
            int max=0;
            for(int i=0;i<b.length();i++){
                int l=i;
                for(int j=0;j<a.length();j++){
                    if(l<b.length()&&b.charAt(l)==a.charAt(j))l++;
                }
                max=Math.max(max,l-i);
            }
            System.out.println(a.length()+b.length()-max);
        }
    }
}