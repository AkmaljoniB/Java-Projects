package Codeforces;

import java.util.Scanner;

public class Square_or_not{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt();
            String s=sc.next(),p="NO";
            if(Math.sqrt(n)*Math.sqrt(n)==n){
                n=(int)Math.sqrt(n);
                if(s.substring(0,n).equals(s.substring(s.length()-n))) {
                    if(n==2||(s.charAt(n)=='1'&&s.charAt(n+n)=='1'&&!s.substring(n+1,n+n-1).contains("1"))){
                        for(int i=n+n;i<s.length()-n;i+=n){
                            if(!s.substring(n,n+n).equals(s.substring(i,i+n))){
                                p="No";
                                break;
                            }
                        }
                        if(p.equals("NO"))p="YES";
                    }
                }
            }
            System.out.println(p);
        }
    }
}