package Codeforces;

import java.util.Scanner;

public class Password_hacking{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s="";
            boolean b=false;
            while(s.length()<n){
                if(!b&&query("0"+s))s="0"+s;
                else if(!b&&query("1"+s))s="1"+s;
                else{
                    if(query(s+"0"))s=s+"0";
                    else s=s+"1";
                    b=true;
                }
            }
            System.out.println("! "+s);
        }
    }
    static boolean query(String s){
        System.out.println("? "+s);
        System.out.flush();
        return sc.nextInt()==1;
    }
}