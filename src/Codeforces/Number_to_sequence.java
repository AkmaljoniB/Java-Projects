package Codeforces;

import java.util.Scanner;

public class Number_to_sequence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),k1=1,p=n;
            StringBuilder sb=new StringBuilder(n+"");
            for(int i=2;i<=Math.sqrt(n);i++) {
                StringBuilder sb1=new StringBuilder();
                int k2=1;
                n=p;
                while(n%i==0&&n/i%i==0){
                    k2++;
                    sb1.append(i+" ");
                    n/=i;
                }
                sb1.append(n+" ");
                if(k2>k1){
                    k1=k2;
                    sb=sb1;
                }
            }
            System.out.println(k1+"\n"+sb);
        }
    }
}