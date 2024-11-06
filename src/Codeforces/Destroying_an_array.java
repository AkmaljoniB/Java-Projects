package Codeforces;

import java.util.Scanner;

public class Destroying_an_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long s=0,p=0;
            for (int i=0;i<n;i++){
                p+=sc.nextInt();
                if (p<0){
                    s+=p;
                    p=0;
                }
            }
            System.out.println(Math.abs(s));
        }
    }
}