package Codeforces;

import java.util.Scanner;

public class The_Legend_of_Leia_Frog{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
            System.out.println(Math.max((x+k-1)/k*2-1,(y+k-1)/k*2));
        }
    }
}