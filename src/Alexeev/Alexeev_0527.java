package Alexeev;

import java.util.Scanner;

public class Alexeev_0527{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0){
            long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
            String s="NO";
            while(b>0){
                if(a==c&&b==d)s="YES";
                if(b>a){
                    long sw=b;
                    b=a;
                    a=sw;
                }
                if(a<c||b<d)break;
                if(a==c&&b==d)s="YES";
                a-=Math.max((a-Math.max(b,c))/b*b,b);
                if(a==c&&b==d)s="YES";
            }
            System.out.println(s);
        }
    }
}
//30 10
//10 10