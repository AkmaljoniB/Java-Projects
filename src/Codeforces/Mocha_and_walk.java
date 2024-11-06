package Codeforces;

import java.util.Scanner;

public class Mocha_and_walk{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),i=0,l=0;
            while(i++<n){
                if(sc.nextInt()==0){
                    System.out.print(i+" ");
                    l++;
                }else break;
            }
            System.out.print(n+1 +" ");
            while(i<n){
                sc.nextInt();
                System.out.print(i++ +" ");
            }
            System.out.println(l!=n?i:"");
        }
    }
}