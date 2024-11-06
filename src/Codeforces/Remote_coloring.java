package Codeforces;

import java.util.Scanner;

public class Remote_coloring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
            System.out.println(Math.min(n,k)*Math.min(m,k));
        }
    }
}