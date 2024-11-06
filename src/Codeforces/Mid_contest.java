package Codeforces;

import java.util.Scanner;

public class Mid_contest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next();
        int h1=Integer.parseInt(a.substring(0,2)),m1=Integer.parseInt(a.substring(3));
        int h2=Integer.parseInt(b.substring(0,2)),m2=Integer.parseInt(b.substring(3));
        int l=((h2-h1)*60+m2-m1)/2;
        while(l>=60){
            l-=60;
            h1++;
        }
        if(m1+l>=60)h1++;
        m1=(m1+l)%60;
        System.out.println("0".substring(0,2-(h1+"").length())+h1+":"+("0".substring(0,2-(m1+"").length())+m1));
    }
}