package Codeforces;

import java.util.Scanner;

public class Brick_wall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            System.out.println(m/2*n);
        }
    }
}