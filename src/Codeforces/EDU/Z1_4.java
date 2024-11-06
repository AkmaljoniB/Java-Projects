package Codeforces.EDU;

import java.util.Scanner;

public class Z1_4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0){
            String s=sc.next(),t=sc.next();
            long r=0,k=0,p=-1;
            for(int i=t.length()-1;i<s.length();i++){
                if(s.substring(i-t.length()+1,i+1).equals(t)){
                    if(p==-1)k=i-t.length()+2;
                    else k+=i-p;
                    p=i;
                }
                r+=k;
            }
            System.out.println((long)(s.length()+1)*s.length()/2-r);
        }
    }
}