package Codeforces;

import java.util.Scanner;

public class Olesya_and_Rodion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        while (s.length()<n)s+=n;
        System.out.println(s.length()==n?s:-1);
    }
}
