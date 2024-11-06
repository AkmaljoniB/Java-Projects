package Codeforces;

import java.util.Scanner;

public class The_ideal_class_of_Cirno_bitmasks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int x=sc.nextInt(),i=2;
            if (x==1) System.out.println(3);
            else if (x%2!=0) System.out.println(1);
            else {
                while (i < x) i *= 2;
                if (i==x) System.out.println(i + 1);
                else {
                    i=2;
                    while ((x&i)==0||(x^i)==0)i*=2;
                    System.out.println(i);
                }
            }
        }
    }
}