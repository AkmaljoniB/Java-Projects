package Codeforces;

import java.util.Scanner;

public class Pain_to_zero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),k=sc.nextLong(),s=0;
            while(n>0){
                if(n%k==0){
                    n/=k;
                    s++;
                }else{
                    s+=n%k;
                    n-=n%k;
                }
            }
            System.out.println(s);
        }
    }
}