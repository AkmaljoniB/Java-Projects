package Codeforces;

import java.util.Scanner;

public class Make_the_majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l1=0,l0=0;
            String s=sc.next();
            for(int i=0;i<n-1;i++){
                if(s.charAt(i)!=s.charAt(i+1)){
                    if(s.charAt(i)=='0')l0++;
                }
                if(s.charAt(i)=='1')l1++;
            }
            if(s.endsWith("0"))l0++;
            if(s.charAt(n-1)=='1')l1++;
            System.out.println(l1>l0?"Yes":"No");
        }
    }
}