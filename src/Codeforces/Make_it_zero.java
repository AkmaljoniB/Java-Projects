package Codeforces;

import java.util.Scanner;

public class Make_it_zero{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            for(int i=0;i<n;i++)sc.nextInt();
            if(n%2==0)System.out.println("2\n1 "+n+"\n1 "+n);
            else System.out.println("4\n1 2\n1 2\n2 "+n+"\n2 "+n);
        }
    }
}