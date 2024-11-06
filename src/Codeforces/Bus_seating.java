package Codeforces;

import java.util.Scanner;

public class Bus_seating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=sc.nextInt()-1,r=l+2;
            String s="YES";
            for(int i=1;i<n;i++){
                int a=sc.nextInt();
                if(s.length()==3){
                    if(a==l)l--;
                    else if(a==r)r++;
                    else s="NO";
                }
            }
            System.out.println(s);
        }
    }
}
