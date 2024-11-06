package Codeforces;

import java.util.Scanner;

public class Medians {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            if(n==1)System.out.println("1\n1");
            else if(k!=1&&k!=n){
                if(k%2==0)System.out.println("3\n"+"1 "+k+" "+(k+1));
                else System.out.println("3\n1 " + (k - 1) + " " + (k + 2));
            }else System.out.println(-1);
        }
    }
}