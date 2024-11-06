package Codeforces;

import java.util.Scanner;

public class Killing_a_monster{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long hc=sc.nextLong(),dc=sc.nextLong(),hm=sc.nextLong(),dm=sc.nextLong(),k=sc.nextInt(),w=sc.nextInt(),a=sc.nextLong();
            String p="NO";
            for(int i=0;i<=k;i++){
                long l=(hc+i*a)%dm==0?(hc+i*a)/dm:(hc+i*a)/dm+1,r=hm%(dc+(k-i)*w)==0?hm/(dc+(k-i)*w):hm/(dc+(k-i)*w)+1;
                if(l>=r){
                    p="YES";
                    break;
                }
            }
            System.out.println(p);
        }
    }
}
