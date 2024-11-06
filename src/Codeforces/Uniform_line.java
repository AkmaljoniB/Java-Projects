package Codeforces;

import java.util.Scanner;

public class Uniform_line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            String a="abcdefghijklmnopqrstuvwxyz";
            for (int i=0;i<n;i++) {
                System.out.print(a.charAt(l));
                l=(l+1)%k;
            }
            System.out.println();
        }
    }
}