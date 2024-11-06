package Codeforces;

import java.util.Scanner;

public class Hamilton_s_wall{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=-1;
            String a=sc.next(),b=sc.next(),p="YES";
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)=='B'&&b.charAt(i)=='B')l=1-l;
                else if(a.charAt(i)=='B')l=0;
                else if(b.charAt(i)=='B')l=1;
                if(l==1&&i!=n-1){
                    if(b.charAt(i+1)=='W')p="NO";
                }else if(l==0&&i!=n-1&&a.charAt(i+1)=='W')p="NO";
            }
            System.out.println(p);
        }
    }
}