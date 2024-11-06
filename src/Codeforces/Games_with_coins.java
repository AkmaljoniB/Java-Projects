package Codeforces;

import java.util.Scanner;

public class Games_with_coins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=2;
            String s=sc.next();
            while(s.contains("U")){
                if(s.contains("UUU")){
                    s=s.replaceFirst("UUU","DD");
                }else if(s.length()>2&&(s+s).contains("UUU")){
                    if(s.startsWith("UU"))s="D"+s.substring(2,s.length()-1)+"D";
                    else s="D"+s.substring(1,s.length()-2)+"D";
                }else if(s.contains("UUD"))s=s.replaceFirst("UUD","DU");
                else if(s.contains("DUU"))s=s.replaceFirst("DUU","UD");
                else{
                    if(s.contains("DUD"))s=s.replaceFirst("DUD","UU");
                    else s=s.replaceFirst("U","");
                }
                l=3-l;
            }
            System.out.println(l==1?"YES":"NO");
        }
    }
}